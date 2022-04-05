package Task_3;

import java.util.*;

public class CollectionPerformance {

    public static void main(String[] args){
        //4) Check performance for some List operations (get(i), insertAfter(i), ..)
        // for different collection implementations.

        List<String> arrayList = new ArrayList<>(List.of(("Check performance for some List operations (get(i), insertAfter(i), ..)" +
                "for different collection implementations.").split(" ")));

        List<String> linkedList = new LinkedList<>(arrayList);

        System.out.println(arrayList);
        System.out.println(linkedList);

        System.out.println(checkGet(arrayList));
        System.out.println(checkGet(linkedList));

        System.out.println(checkInsert(arrayList));
        System.out.println(checkInsert(linkedList));




    }

    private static long checkInsert(List<String> arrayList) {
        long start = new Date().getTime();
        int size=arrayList.size();
        for(int i=0;i<10000;i++){
            arrayList.add("String");
        }

        return  new Date().getTime()-start;
    }


    private static long checkGet(List<String> arrayList) {
        long start = new Date().getTime();
        int size=arrayList.size();
        for(int i=0;i<10000;i++){
            int randomIndex=new Random().nextInt(size);
            int wsize=arrayList.get(randomIndex).length();
        }

        return  new Date().getTime()-start;
    }


}
