import org.w3c.dom.ls.LSOutput;

//import static com.Rushik.Packages.b.notokay.message;
//public class Static {
//    public static void main(String[] args) {
//        System.out.println(Human.population);
//        Human h = new Human(20,2000,74);
//        System.out.println(Human.population);
//        Human k = new Human(90,900100,79);
//        System.out.println(Human.population);
        //System.out.println(Human.population);
        //System.out.println(h.population);//not recommended because it doesnt
        // care if field exists or not in object
        // yet it will search the object first
        // effecting efficiency
        //System.out.println(k.population);
        //Idoknow();//can access ststic from static
        //Idont();//cant access non static from static

    //}
    //int l=82;
//    public void Idont(){
//        Idoknow();//no error (static in non-static)
//        System.out.println("Hello me "+l);//no error non-static from non-static
//    }
//    static int m =37;
//    public static void Idoknow(){
//        //System.out.println(l);//gives error as l is non static
//        // and being accessed from static context because l has an instance
//        //but Idoknow() function doesnt have an instance
//        System.out.println("Hello know me "+m);//no error
          //you cannot access non static stuff without referencing
          // their instances in a static context.
          //Hence below when I reference it, it doent give error.
          //Static obj = new Static();
          //System.out.println(obj.l);//no error
//    }
//
//
//}
//class Human{
//    int age;
//    int salary;
//    static int population=93;//changes in one object to the static variable
//    // effects every object of the class.
//    public Human(int age, int salary,int population){
//        this.age = age;
//        this.salary = salary;
//       Human.population = population;
        //Human.population=population;
//        System.out.println(this.population);
//        System.out.println(population);
        //this.population = this.population+1;
        //Human.population = Human.population+1;
        //System.out.println(Human.population);
        //Human.population = population+1;
        //population = Human.population;
//        System.out.println(Human.population);
//        System.out.println(population);
//    }
//    static void Something(){
//        System.out.println("hello u");
//    }
//}

//package com.Rushik.Packages.b.c;
////import static com.Rushik.Packages.b.notokay.message;
//public class Static {
//    public static void main(String[] args) {
//
//        Human k= new Human(10,20,30);
//        Human h = new Human();
//    }
//}
//class Human{
//    int age;
//    int salary;
//    static int population;
//    public Human(int age, int salary, int population){
//        this.age = age;
//        this.salary = salary;
//        System.out.println(this.population);
//        System.out.println(this.age);
//        System.out.println(this.salary);
//        System.out.println(population);
//        this.population = this.population+1;
//        System.out.println(this.population);
//        this.population = population+1;
//        System.out.println(this.population);
//        System.out.println(population);
//        this.population = population;
//    }
//    public Human(){
//        System.out.println(age);
//        System.out.println(population);
//        System.out.println(salary);
//        //System.out.println(this.age);
//
//    }
//}
import java.util.*;
public class Static{
    static int a=10;
    static int b=20;
    static{//static initialization block.
        int c=103;
//        public static void func(){
//            System.out.println("This. is . me");
//        }
        func();
        System.out.println(c);
        a = b * 10;
        b = a * 5;
    }
    static{//will only run once, when cls is loaded for the first time before any instances are created or static members are accessed
        System.out.println(a);
        System.out.println("I am in sttaic block");
        a=a*5;
        System.out.println(a);
    }
    public static void func(){
        a = b*5;
        System.out.println(Static.a);
        System.out.println("This ain't me yo");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Static obj = new Static();
        //obj.func();
        System.out.println(Static.a+" "+Static.b);
    }
}

