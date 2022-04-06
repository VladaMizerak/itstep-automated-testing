package Task_4.generic;

import Task_4.reflection.CustomClass;

import java.util.*;

public class Main {

    public static void  main(String[] args){
        //Make two different comparators for your Custom class (simple java class with few fields).
        // End users should be able to use ‘min’, ‘max’, ‘sort’ methods with that comparators.

        List<CustomClass> list = new ArrayList<>(Arrays.asList(
                new CustomClass("fff", 444),
                new CustomClass("aaa", 222),
                new CustomClass("ddd", 555)
        ));

        System.out.println(list);
        System.out.println(max(list, new PersonComparatorByField2()));
        System.out.println(min(list, new PersonComparatorByField2()));
        System.out.println(sort(list, new PersonComparatorByField2()));
        System.out.println(list);

    }

    private static CustomClass max(List<CustomClass> list, Comparator<CustomClass> personComparatorByField2) {
         return Collections.max(list, personComparatorByField2);

    }

    private static CustomClass min(List<CustomClass> list, Comparator<CustomClass> personComparatorByField2) {
        return Collections.min(list, personComparatorByField2);

    }

    private static boolean sort(List<CustomClass> list, Comparator<CustomClass> personComparatorByField2) {
         Collections.sort(list, personComparatorByField2);

        return true;
    }
}
