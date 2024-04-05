package Generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Student rushik = new Student(10,99f);
        Student shiva = new Student(9,89.9f);
        Student krishna = new Student(11,87.9f);
        Student vishal = new Student(12,79.9f);
//        System.out.println(shiva.marks);
//        System.out.println(rushik.marks);
//        System.out.println(Float.compare(shiva.marks,rushik.marks));

        Student[] list = {rushik, shiva, krishna, vishal};
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int diff = (int)(o1.marks - o2.marks);
                return diff; // gives ascending order.
//                return -diff;// gives descending order
            }
        });

// Arrays.sort(list,(o1,o2)-> (int)(o1.marks-o2.marks));// does the same thing as above This is Lambda representation.


        System.out.println(Arrays.toString(list));
//        System.out.println(rushik.compareTo(shiva));
//        System.out.println("this is sme");

        if(rushik.compareTo(shiva)<0){
            System.out.println("Shiva got more marks");
        }
        else if(rushik.compareTo(shiva)>0){
            System.out.println("Rushik got more marks");
        }
        else{
            System.out.println("Both got same marks");
        }
    }
}
