package com.company.LessonOne.HomeWorkOne;

import java.security.PublicKey;

public class HomeWorkOne {
    public static void main(String[] args){
        byte a=127;
        short a1=888;
        int a2=88888;
        long a3=888888888;

        System.out.println("Первая задача byte для примера было взято -> 63");
        byte b=0B111111; // 2-ичная система счислений
        byte b1=077; // 8-ичная система счислений
        byte b2=63; // 10-ичная система счислений
        byte b3=0X3F; // 16-ичная система счислений
        System.out.println("2-ичная система счислений" + b);
        System.out.println("8-ичная система счислений" +b1);
        System.out.println("10-ичная система счислений" +b2);
        System.out.println("16-ичная система счислений" +b3);
        System.out.println("");

        System.out.println("Вторая задача для short для примера было взято -> 1000");
        short c=0B1111101000; // 2-ичная система счислений
        short c1=01750; // 8-ичная система счислений
        short c2=1000; // 10-ичная система счислений
        short c3=0x3E8; // 16-ичная система счислений
        System.out.println("2-ичная система счислений" + c);
        System.out.println("8-ичная система счислений" + c1);
        System.out.println("10-ичная система счислений" + c2);
        System.out.println("16-ичная система счислений" + c3);
        System.out.println("");

        System.out.println("Третья задача для int для примера было взято -> 100000");
        int d=0B11110100001001000000; // 2-ичная система счислений
        int d1=03641100; // 8-ичная система счислений
        int d2=1_000_000; // 10-ичная система счислений
        int d3=0xF4240; // 16-ичная система счислений
        System.out.println("2-ичная система счислений" + d);
        System.out.println("8-ичная система счислений" + d1);
        System.out.println("10-ичная система счислений" + d2);
        System.out.println("16-ичная система счислений" + d3);
        System.out.println("");

        System.out.println("Четвертая задача для long для примера было взято -> 1_000_000_2");
        long e=0B100110001001011010000010; // 2-ичная система счислений
        long e1=046113202; // 8-ичная система счислений
        long e2=1_000_000_2; // 10-ичная система счислений
        long e3=0x989682; // 16-ичная система счислений
        System.out.println("2-ичная система счислений" + e);
        System.out.println("2-ичная система счислений" + e1);
        System.out.println("2-ичная система счислений" + e2);
        System.out.println("2-ичная система счислений" + e3);
        System.out.println("");

        System.out.println("Использование юникода");
        System.out.println("Отоброжение знак доллара через юникода");
        char ch= '\u0024';
        System.out.println("Знак доллара через юникод->" + ch);
    }
}


