package com.lesson5;

public class Garland {
    public static void main(String[] args) {
        blink(10);
        line(32);
        System.out.println(isFistLampOn(101));
    }

    public static void blink(int number) {
        int garland = 0;
        for (int i = 0; i < number; i++) {
            System.out.println(Integer.toBinaryString(garland));
            garland = ~garland;
        }
    }

    public static void line(int number) {
        int garland = 1;
        for (int i = 0; i < number; i++) {
            System.out.println(Integer.toBinaryString(garland));
            garland = garland << 1;
        }
    }

    public static boolean isFistLampOn(int garland) {
        return (garland & 1) == 1;
    }


}
