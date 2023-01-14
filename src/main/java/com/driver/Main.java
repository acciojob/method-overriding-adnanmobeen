package com.driver;
public class Main {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.meth());
    }
    static class B extends A {
        public  String meth() {
            return "Method is overridden in Extendend class B";
        }
    }
     static class A {
        public  String meth() {
            return "Invoking method from class A";
        }
    }
}

