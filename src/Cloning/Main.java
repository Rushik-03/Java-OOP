package Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(20,"Rushik");
//        Human twin = new Human(human);// shallow copy.
        //this will also create a clone but not recommended due to overhead.
//clone is a method in object class used to make copies of objects.
        Human twin = (Human)human.clone(); //normally shallow copy but we can chnage it to deep copy
//        System.out.println(human);
//        System.out.println(human.clone()) ;
//        System.out.println(twin.age);
//        System.out.println(human.age);
//        System.out.println(Arrays.toString(twin.arr));
//        twin.arr[0] = 101;
//        twin.age=99;
//        System.out.println(human.age);
//        System.out.println(twin.age);
//        System.out.println(Arrays.toString(human.arr));
//        System.out.println(Arrays.toString(twin.arr));

    }
}
