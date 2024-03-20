package Polymorphism;

public class Shapes {
    int sides = 199;
    int m = 99;
    private int z = 31; // data hiding.
//    public void soaps(int sides){
//        this.sides = sides;
//        System.out.println(this.sides);
//    }
//    void soaps(String sides,int length, double breadth, float height){
//        System.out.println(sides);
//        System.out.println(length);
//        System.out.println(breadth);
//        System.out.println(height);
//    }
//    void soaps(String sides,double length, int breadth, float height){
//        System.out.println(sides);
//        System.out.println(length);
//        System.out.println(breadth);
//        System.out.println(height);
//    }
//
//    void something(int a, double b , float c){
//        System.out.println("First one");
//    }
    public void area(){
        System.out.println("THis is from shapes");
    }
//    void something(double a, int b , float c){
//        System.out.println("Sedond one");
//    }

    public int getZ(){ // encapsulation.
        return z;
    }
}
