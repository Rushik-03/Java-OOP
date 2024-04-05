package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Sonn son = new Sonn();
        daughter d = new daughter();
//        Mother m = new Mother();//will give error as methods are abstract and we cant create an instance of abstract class.
        Parent m = new Sonn();// possible as object is of type Sonn which has initializations of abstract methods that are in it.


        son.career();
        d.career();
        Parent.hello();
        d.something(); // could be accessed from child class objects as parent abstract class cant have an object
    }
}

