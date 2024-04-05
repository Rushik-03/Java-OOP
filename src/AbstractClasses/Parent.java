package AbstractClasses;

public abstract class Parent {
//    int i =10;
//    public int j=10;
//    private int l=10;
//    protected int k=10; // all access modifiers are allowed in abstract classes.
//    final int m=10;
//    final abstract void some(){} // gives error due to final cant be overriden.
    abstract void career();
    abstract void partner();
//    {
//        System.out.println("Rushik it is");
//    }
    void something(){
        System.out.println("this is something");
    }
    static void hello(){
        System.out.println("Say hello!");
    }
}
