package com.company;

public class ClassInt implements MyInteger {
    int num1;

    public ClassInt(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    @Override
    public void isEven(int num1) {
        if (num1 % 2 == 0)
            System.out.println("your num is an even num!");
        else
            System.out.println("your num is not an even num!");
    }

    @Override
    public void isOdd(int num1) {
        if (num1 % 2 != 0)
            System.out.println("your num is on odd num!");
        else
            System.out.println("your num is not an odd num!");

    }

    @Override
    public void ispositive(int num1) {
        if (num1 > 0)
            System.out.println("your num is a positive num!");
        else
            System.out.println("your num is not a negative num!");
    }

    @Override
    public void isNegative(int num1) {
        if (num1 < 0)
            System.out.println("your num is a negative num!");
        else
            System.out.println("your num is not a positive num!");

    }

    @Override
    public void isZero(int num1) {
        if (num1 == 0)
            System.out.println("your num is zero!");
        else
            System.out.println("your num is not equal zero!");

    }
}
