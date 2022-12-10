package com.driver;

public class Main {

    public static class A{

        public  String Meth(){
            return "Invoking method from class A";
        }
    }
    public static class B extends A{
        public String Meth(){
            return "Method is overridden in Extendend class B";
        }
    }

 public static  void main(String[] args){
        B obj = new B();
           obj.Meth();
 }
}