

// Normal Constructor Calling along with Method, Static And Non-Static Blocks

package com.tka;
public class Demo {


    static {
        System.out.println("This is Static-Block");
    }

     {
        System.out.println("This is Non-Static Block");
    }


    public Demo() {  //CONSTRUCTOR is Used here
        System.out.println("This is Constructor...");
    }

    public void m1() {
        System.out.println("This is Method...");
    }

    public static void main(String[] args) {
        Demo e = new Demo();
        e.m1();
    }

}

//Output :
//This is Static-Block
//This is Non-Static Block
//This is Constructor...
//This is Method...



