package com.company.LessonOne;

public class PrimitiveDataTypes {

    public static void main (String[] args){
        byte b=100;
        short s=12347;
        int i=1231234;
        long l=1232434545l;


        char c='a';
        char c1='9';
        char c2=' ';
        // здесь испоьзуется юникод
        char c3=60000;
        char c4='\u1925';

        float f=1.333f;
        double d=1.77773D;

        boolean b1 =true;
        boolean b2 =false;

        // 2-ичная система счислений
        int i1=60; // для примера цифры брали  60
        int i2=0B111100;
        int i3=0b111100;

        // 8-ичная система счислений
        int i4=074; // для примера цифры брали  60

        // 16-ичная система счислений
        int i5=0x3c; // для примера цифры брали  60
        int i6=0x3c; // для примера цифры брали  60
        //Символы under score
        int i7=1_000_000_000;
        int i8=1_000_000_0_2;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("");

        System.out.println(f);
        System.out.println(d);
        System.out.println("");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println("");

        System.out.println("//  для примера цифры брали 60 для 2-ичной система счислений " +i1);
        System.out.println("// 2-ичная система счислений " + i2);
        System.out.println("// 2-ичная система счислений " + i3);
        System.out.println("");

        System.out.println("// для примера цифры брали 60 для 8-ричной система счислений" + i4);
        System.out.println("");

        System.out.println("// для примера цифры брали 60 для 16-ричной система счислений" + i5);
        System.out.println("// для примера цифры брали 60 для 16-ричной система счислений" + i6);
        System.out.println("");

        System.out.println("//Символы under score " + i7);
        System.out.println("//Символы under score " + i8);

}

}