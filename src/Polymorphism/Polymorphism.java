package Polymorphism;

public class Polymorphism {
    public static void main(String[] args){
        Shapes shape = new Shapes();
        System.out.println(shape.getZ());
//        Square square = new Square();
//        Triangle triangle = new Triangle();
//        shape.soaps(101);
//        shape.soaps("this is sides",91,81.0,901);
//        shape.soaps("this is it",91.0,81,71);
//        shape.something(99.0,101,4);
//        square.Area(99);
//        triangle.Area(109);
//        Square shape = new Square();
//        Shapes soaps = new Square();
//        shape.area();// both call the method from shapes only even if it declared as static in child class it doesnt matter.
//        soaps.area();//It doesnt matter if a method is static in its parent cls or child clses, whenever a static method
        // is called using object of any type it still calls the parent cls method only.
//        System.out.println(shape.sides);// polymorphism doesnt apply to instance variables.
    }
}
