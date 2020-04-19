package com.lesson4;

public class Average {

    public static void main(String[] args) {
	    double total = 0;
        for (String arg : args) {
            total += Double.parseDouble(arg);
        }

        System.out.println("Average: " + total/args.length);
    }
}
