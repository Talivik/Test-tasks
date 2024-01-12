package com.company;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        double result = calculateUn(n);
        System.out.println("Значение функции U" + n + " = " + result);
    }

    public static double calculateUn(int n) {
        BigDecimal sum = BigDecimal.ZERO;
        BigDecimal factorial = BigDecimal.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            sum = sum.add(factorial);
        }

        BigDecimal un = BigDecimal.ONE.divide(factorial, 6, RoundingMode.HALF_UP).multiply(sum);

        return un.doubleValue();
    }
}
