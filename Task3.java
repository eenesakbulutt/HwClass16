package com.syntax.class17;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Task3 {

    // Create a method that will accept a
    // String as a parameter and return a new String that consist only of vowels.
    // Method should be available inside the class only where it was declared
    // and executed by calling it is name.


    private static String onlyVowels(String inputStr){
       return inputStr.replaceAll("[^aeiouAEIOU]","");

    }


    public static void main(String[] args) {
        System.out.println(onlyVowels("abcdergrgwrgoU"));


    }





}
