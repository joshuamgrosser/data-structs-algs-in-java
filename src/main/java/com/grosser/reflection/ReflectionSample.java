package com.grosser.reflection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: joshuagrosser
 * Date: 3/3/13
 * Time: 11:09 AM
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionSample {

    private static ReflectionSample instance;

    private enum SomeEnum { ITEM_A, ITEM_B }

    /**
     * Main method for testing reflection methods.
     * @param args command-line args
     */
    public static void main(String[] args){
        instance = new ReflectionSample();
        instance.doSomething();
    }

    public void doSomething(){

        // Returns "class java.lang.String"
        Class clazz = String.class;
        System.out.println("Class for String: " + clazz.toString());

        // Returns "class com.grosser.reflection.ReflectionSample$SomeEnum"
        Class enumClazz = SomeEnum.ITEM_A.getClass();
        System.out.println("Class for enum ITEM_A: " + enumClazz.toString());

        // Type of byte array is "class [B", not sure why
        byte[] bytes = new byte[1024];
        Class bytesClazz = bytes.getClass();
        System.out.println("Class for byte array: " + bytesClazz.toString());

        // Parameterized type returns the parent type "class java.util.HashSet"
        Set<String> s = new HashSet();
        Class setClazz = s.getClass();
        System.out.println("Class for HashSet<String>: " + setClazz.toString());

        // Use .class if there is no instance available, or for primitive types
        // Returns "interface java.util.Map"
        Class mapClazz = Map.class;
        System.out.println("Class for Map: " + mapClazz.toString());

        // Use Class.forName(String) to look up a class by fully qualified name
        // Returns "class java.util.HashMap"
        Class hashMapClazz;
        try {
            hashMapClazz = Class.forName("java.util.HashMap");
            System.out.println("Class for HashMap using forName(): " + hashMapClazz.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

}
