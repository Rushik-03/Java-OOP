package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Sonn son = new Sonn();
        daughter d = new daughter();

        son.career();
        d.career();
        daughter.hello();
        d.something(); // could be accessed from child class objects as parent abstract class cant have an object
    }
}

