package com.demo.demo;

public class DefaultValuePremitive {
static byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bu;
    
    public static void main(String[] args) {
       DefaultValuePremitive def = new DefaultValuePremitive();
        System.out.println(b);
        System.out.println(def.s);
        System.out.println(def.i);
        System.out.println(def.l);
        System.out.println(def.f);
        System.out.println(def.d);
        System.out.println(def.c);
        System.out.println(def.bu);
    }
}