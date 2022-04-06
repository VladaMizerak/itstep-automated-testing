package Task_5;

import Task_4.generic.PersonComparatorByField3;
import Task_4.reflection.CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args){
        //Make simple model
        //generate some list with those Model objects
        //use stream with custom comparator
        //collect it to String list using some field

        List<CustomClass> list = new ArrayList<>(Arrays.asList(
                new CustomClass("fff", 444, 66),
                new CustomClass("aaa", 222, 53),
                new CustomClass("ddd", 555, 543)
        ));

        System.out.println(list);
        List<String> resulList = list.stream().sorted(new PersonComparatorByField3()).map(m->m.getField1()).collect(Collectors.toList());
        System.out.println(resulList);


    }
}
