package com.test.strs;

public class MutableStringsTest {
    public static void main(String[] args) {
        StringBuffer sBuff;

        StringBuilder sBuild = new StringBuilder();
        sBuild.append("Hello");
        String str = null;
        sBuild.append(str);
        sBuild.append(123).append('x').append(" World!");
        System.out.println(sBuild);

        StringBuilder sBuild2 = new StringBuilder(128);
        sBuild2.append("Hello world!");
        sBuild2.append("Hello world!");
        sBuild2.append("Hello world!");
        System.out.println(sBuild2);

        StringBuilder sBuild3 = new StringBuilder("1024");
        StringBuilder sBuild4 = new StringBuilder(sBuild);
        System.out.println(sBuild4);

        System.out.println(sBuild4.reverse());

        System.out.println("Capasity: " + sBuild.capacity());
        System.out.println("Length: " + sBuild4.length());


        String words[] = sBuild4.toString().split(" ");
        for (String word : words){
            System.out.println(word);
        }

        HTMLTableBuilder htmlTable = new HTMLTableBuilder();

        htmlTable.addHeaders("ID", "NAME", "AVG");

        htmlTable.addStudents(new Student(123, "John", "J", 3, 9.5));



        System.out.println(htmlTable.build());







    }
}
