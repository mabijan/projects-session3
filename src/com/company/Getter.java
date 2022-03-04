package com.company;
import java.util.Scanner;

public class Getter {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("""
                HI
                Please enter the field you wish!
                available options are:(Omomi==>1  Ekhtesasi==>2)""");

        int KEY = input.nextInt();

        var Test_object = new Courses(KEY);
        Test_object.get_info();
    }
}
