package com.hillel.classwork.lesson6.RElern;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "Text";
        String s2 = s1;
        String s3 = "Text";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s3);
        System.out.println(s3.hashCode());
        System.out.println();
        System.out.println("Compare values: ");
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s2));
        System.out.println("Text".equals(s2));
        System.out.println(s1.equals("t"));
    }
}
