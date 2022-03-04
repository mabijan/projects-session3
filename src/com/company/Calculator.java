package com.company;

public class Calculator {
    private double num1;
    private double num2;

    public Calculator(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() { return num1; }

    public void setNum1(double num1) { this.num1 = num1; }

    public double getNum2() { return num2; }

    public void setNum2(double num2) { this.num2 = num2; }

    public void equation(){
        switch (1) {
            case 1, 2, 3, 4 -> {
                System.out.format("your equation for case(+):%f\n", num1 + num2);
                System.out.format("your equation for case(-):%f\n", num1 - num2);
                System.out.format("your equation for case(*):%f\n", num1 * num2);
                System.out.format("your equation for case(/):%f\n", num1 / num2);}
        }
    }
}
