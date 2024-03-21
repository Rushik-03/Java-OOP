package AccessModifiers;

public class A {
    protected int x = 909;
    private int k = 555;
    int l = 805;
    public static void main(String[] args) {
        A obs = new A();
        System.out.println(obs.x);
        System.out.println("THis is not it");
    }
}

class B extends A{
    B(){
        System.out.println(l);
        System.out.println(x);
    }

    public static void main(String[] args) {
    }
}
