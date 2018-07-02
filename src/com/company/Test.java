package com.company;
import java.lang.System;

public class Test {
    private String name;

    public void setName(String s){
        name = s;
    }
    public String getName(){
        return name;
    }

    public void say(){
        System.out.println(name);
    }
}
