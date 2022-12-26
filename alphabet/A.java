package com.company;

public class A {
    public String a;
    public A(String a){
       this.a = a;
    }

    @Override
    public String toString(){
        return "This is: " + this.a;
    }
}
