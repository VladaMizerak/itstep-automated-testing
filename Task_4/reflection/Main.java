package Task_4.reflection;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args){
        //Write a method which can work with any object using reflection. End user should be able use it like this:
        //get(object,”fieldName”) - return value of field
        //		put(object,”fieldName”,value) - put the value to field
        //		clear(object,”fieldName”) - put null or 0 to the field.
        //Methods should throw exceptions with explanations if something is wrong.

        CustomClass customClass = new CustomClass("fff", 444);


        System.out.println(set(customClass, "field1", "updated string"));
        System.out.println(get(customClass, "field1"));

        System.out.println(clear(customClass, "field1"));
        System.out.println(get(customClass, "field1"));

    }

        private static Object get(Object object, String fieldName){
            Class myClass = object.getClass();
            try {
                Field f = myClass.getDeclaredField(fieldName);
                f.setAccessible(true);

                return f.get(object);
            } catch (IllegalAccessException | NoSuchFieldException e){
                e.printStackTrace();
            }

            return null;
        };

        private static boolean set(Object object, String fieldName, String value){
            Class myClass = object.getClass();
            try {
                Field f = myClass.getDeclaredField(fieldName);
                f.setAccessible(true);
                f.set(object, value);

            } catch (IllegalAccessException | NoSuchFieldException e){
                e.printStackTrace();
            }

            return true;
        }

        private static boolean clear(Object object, String fieldName){
            Class myClass = object.getClass();
            try {
                Field f = myClass.getDeclaredField(fieldName);
                f.setAccessible(true);
                f.set(object, null);

            } catch (IllegalAccessException | NoSuchFieldException e){
                e.printStackTrace();
            }

            return true;
        }

}
