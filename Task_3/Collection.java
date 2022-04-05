package Task_3;

import java.util.*;

public class Collection {

    public static void main(String[] args){
        //1) Implement an application to work with a list. In the 1st half of the list replace all elements E1 with E2
        Integer E1 = 5;
        Integer E2 = 9;
        List<Integer> collection = new ArrayList<>(Arrays.asList(1,4,5,7,2,8,5));

        System.out.println(collection);
        int halfIndex = collection.size()/2;
        for(int i1=0; i1<halfIndex;i1++){
            if(collection.get(i1).equals(E1)){
                collection.set(i1,E2);
            }
        }

        System.out.println(collection);


        //2) Input: matrix of integers.
        List<List<Integer>> collection2 = new ArrayList<>(Arrays.asList(
                Arrays.asList(1, 4, 5),
                Arrays.asList(2, 7, 5),
                Arrays.asList(8, 1, 3)));

        print(collection2);

        // a) Print out matrix in reverse order.
        System.out.println();
        for(int i2=0; i2<collection2.size();i2++){
            System.out.println();
            for(int j2=0;j2<collection2.get(0).size();j2++){
                System.out.print(collection2.get(j2).get(i2)+"\t");
            }
        }

        // b) Print out matrix with unique values (delete duplicates)
        System.out.println();
        Set<Integer> uniqueElements= new HashSet<>();
        for(int i2=0; i2<collection2.size();i2++){
            for(int j2=0;j2<collection2.get(0).size();j2++){
                if(uniqueElements.contains(collection2.get(i2).get(j2))){
                    collection2.get(i2).set(j2,0);
                }
                else {
                    uniqueElements.add(collection2.get(i2).get(j2));
                }
            }
        }
        print(collection2);

    }

    private static void print(List<List<Integer>> collection) {
        for(int i2=0; i2<collection.size();i2++){
            System.out.println();
            for(int j2=0;j2<collection.get(0).size();j2++){
                System.out.print(collection.get(i2).get(j2)+"\t");
            }
        }
    }

}
