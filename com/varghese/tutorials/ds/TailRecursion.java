package com.varghese.tutorials.ds;

public class TailRecursion {

    public static int accumulator;

    public TailRecursion() {
        accumulator = 1;
    }

    public void factorial(int n) {
        if(n==0)
            return;
        try {
            calc(n)
        } catch (Exception e) {
            factorial(n-1);
        }
    }

    private void calc(n) throws Exception {
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