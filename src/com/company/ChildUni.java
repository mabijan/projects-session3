package com.company; //taklif jalaseh 3 ===> tamrinc kelasi

public class ChildUni extends ParentUni {

    @Override
    public void student() {
        System.out.println("Student");
    }

    @Override
    public void Teacher() {
        System.out.println("Teacher");
    }

    @Override
    public void Employee() {
        System.out.println("Employee");
    }
}
