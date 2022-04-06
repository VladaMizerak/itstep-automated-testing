package Task_4.generic;

import Task_4.reflection.CustomClass;

import java.util.Comparator;

public class PersonComparatorByField3 implements Comparator<CustomClass> {
    public int compare(CustomClass o1, CustomClass o2) {
        return o1.getField3().compareTo(o2.getField3());
    }
}
