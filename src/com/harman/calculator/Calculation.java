package com.harman.calculator;

public class Calculation {
    public static void main(String[] args) {
        Subtraction subobj=new Subtraction();
        int x = 3;
        int y = 2;
        int z =x+y;
        System.out.println(z);
       Integer subresult=subobj.sub2numbers(x,y);
        System.out.println(subresult);
    }
}
