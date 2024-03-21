package Modifiers;
import AccessModifiers.A;

public class K extends A {
    K(){
//        System.out.println(k); k is private only in that class it is accessible
//        System.out.println(l); l has no modifier mean it cant be accessed from any other package.

    }

    public static void main(String[] args) {
        K obj = new K();
        System.out.println(obj.x);
//        System.out.println(obj.k);
//        System.out.println(obj.l);
        A parent = new A();
//        System.out.println(parent.k);
//        System.out.println(parent.l);
//        System.out.println(parent.x); // gives error as, even the parent object cannot access the protected members outside the package it is declared

    }
}
