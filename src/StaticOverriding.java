

class Superclass {
    void instanceMethod() {
        System.out.println("Superclass instance method");
    }

    static void staticMethod() {
        System.out.println("Superclass static method");
    }
}

class Subclass extends Superclass {
    void instanceMethod() {
        System.out.println("Subclass instance method");
    }

    static void staticMethod() {
        System.out.println("Subclass static method");
    }
}

public class StaticOverriding {

    // whenever we call a method using an object it first checks if the method is present in the object or not
    // if not only then it will check parent class to check the object.
    public static void main(String[] args) {
        Superclass obj1 = new Subclass();
        obj1.instanceMethod(); // Output: Subclass instance method // this is overriden.
        obj1.staticMethod();   // Output: Superclass static method
        // reference type determines what we can access and object type determines from where it is accessed. So when we try to
        // ovveride static methods it wont give any error but as shown above Superclass can access both methods instancemethod() and staticmethod()
        // but from where it access is determined by object type which in above case is Subclass so the outpuut should be
        // Subclass instance method and subclass static method but static method is not overriden and hence gives us Superclass static method as output.
//        Superclass.staticMethod();
//        Subclass.staticMethod();
        Superclass obj3 = new Superclass();
        obj3.instanceMethod(); //superclass instance method.

        Subclass obj2 = new Subclass();
        obj2.instanceMethod(); // Output: Subclass instance method.
        obj2.staticMethod();   // Output: Subclass static method.
    }
}

