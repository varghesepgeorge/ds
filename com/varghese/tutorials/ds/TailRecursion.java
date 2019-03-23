package com.varghese.tutorials.ds;

/* Attempt to not have deep recursive stacks */

public class TailRecursion {

    public static long accumulator;

    public TailRecursion() {
        accumulator = 1;
    }

    public void factorial(long n) {
        if(n==0)
            return;
        try {
            calc(n);
        } catch (Exception e) {
            factorial(n-1);
        }
    }

    private void calc(long n) throws Exception {
        accumulator = accumulator * n;
        throw new Exception();
    }

    public void printResult() {
        System.out.println("Factorial : " + accumulator);
    }

    public static void main(String[] args) {
        TailRecursion t = new TailRecursion();
        t.factorial(5);
        t.printResult();
    }

}