package com.lesson5;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculate(100));
    }

    public static BigInteger calculate(long n) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

}
