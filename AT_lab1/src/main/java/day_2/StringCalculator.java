package day_2;

public class StringCalculator {


    public static  void main(String[] args) {

        //Task 2. Given a string, find the number of words in it.

        String s = "Lorem ipsum, or lipsum as it is sometimes known.";

        System.out.println(s.split( " ").length);

        //Task 3. Given a string, show number of chars in each word

        for(String w:s.split( " ")){
            System.out.println(w.length());
        }

        //Task 4. Create function which takes 2 parameters:
        //1st(String) – text; 2nd (int) - index of word.
        // Function should return number of chars in word by its index in text


        System.out.println(stringCalculator(s, 2));




    }
    static int stringCalculator(String s, int a){
        return s.split(" ")[a].length();
    }

}
