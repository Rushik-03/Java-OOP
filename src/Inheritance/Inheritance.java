package Inheritance;
public class Inheritance {
    int a,b,c;
    int m;
    private int k;
    Inheritance(int a, int b){
//        super();
        this.a = 10;
        this.b = 20;
        this.c = 30;
    }
    Inheritance(int a, int b, int c){
        this.a = 10;
        this.b = 20;
        this.c = 3;
    }Inheritance(int a){
        System.out.println("this is executed first");
        this.m = 808;
        this.a = a;
        this.b = 20;
        this.c = 0;
    }
    Inheritance(){
        System.out.println("This is first");
        this.a = 10;
        this.b = 20;
        this.c = 33;
        this.k = 101;
        this.m = 808;
    }
}

class Child extends Inheritance{
    int m;
    Child(int m){
//        super(9);// if no super then calls default constructor of parent class.
        System.out.println("This is executed 2nd");
        this.m = m;
        System.out.println(this.m);
        System.out.println(super.m);

    }
    Child(){
        //super(3,5);
        this.m = 34;
    }
    Child(int a, int b, int c , int m){
        super(a,b,c);
        this.m = m;
    }
}
class grandChild extends Child{
    int p;
    grandChild(int p){
        super(909);
        this.p = p;
        System.out.println(this.p);
        System.out.println("No parameter constructor is called");
    }
}
class Main{
    public static void main(String[] args) {
        //Child i = new Child();
//        System.out.println(i.c);
//        System.out.println(i.m);
//        Child k = new Child(20);
//        System.out.println(k.c);
//        System.out.println(k.m);
//        Inheritance c= new Inheritance(88,99);
        Child c2 = new Child(909);
        Inheritance i = new Child(99);
        Inheritance j = new grandChild(101);
        grandChild s = new grandChild(191);

//        System.out.println(s.p);
//        System.out.println(s.a);
//        System.out.println(s.b);
//        System.out.println(s.c);
//        System.out.println(s.m);
//        System.out.println(s.a);
//        System.out.println(c2.m);
//        System.out.println(c);
//        System.out.println(c.a);
//        System.out.println(c.b);
//        System.out.println(c.c);
//        System.out.println(c.m);
    }
}
