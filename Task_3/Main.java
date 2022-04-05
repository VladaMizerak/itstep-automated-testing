package Task_3;

import java.util.Arrays;

public class Main {

    public  static  void main(String[] args){

        //1) Find max number in array: 5, 9, 3, 2, 0, -4, -8.3, 3, -4

        double[] array= {5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        double max = array[0];
        for(double a:array){
            if(a>max){
                max = a;
            }
        }
        System.out.println(("max = " +max));

        //2) Given array: {1, 6, 3, 3, 4, 5, 5, 6, 0}.
        // Print array with only unique values, which are sorted.

        int[] array2= {1, 6, 3, 3, 4, 5, 5, 6, 0};
        int[] result= new int[array2.length];
        int i=0;

        for(int x:array2){
            if(!contains(result,x)){
                result[i++]=x;
            }
        }

        Arrays.sort(result);
        Arrays.stream(result).forEach(System.out::println);


        //3)Given an array, e.g. "12", "23", "34", "12", "56", "67“.
        // Replace all values “12” to “replaced”

        String[] array3= {"12", "23", "34", "12", "56", "67"};
        for(int i_3=0;i_3<array3.length;i_3++){
            if(array3[i_3].equals("12")){
                array3[i_3]="replaced";
            }
        }
        Arrays.stream(array3).forEach(System.out::println);

        //4) Print any array in reverse mode (from the end)
        String[] array4= {"12", "23", "34", "12", "56", "67"};
        String[] reversed = new String[array4.length];
        for(int i_4=0;i_4<array4.length;i_4++){
            reversed[(reversed.length-i_4)-1]=array4[i_4];
        }
        Arrays.stream(reversed).forEach(System.out::println);


    }

    private static boolean contains(int[] array, int element) {
        for(int x:array){
            if(element == x){
                return true;
            }
        }
        return false;
    }



}
