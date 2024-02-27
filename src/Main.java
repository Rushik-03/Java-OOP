import java.util.*;
public class Main {
//    public static boolean recurse(int n){
//        System.out.println(n);
//        return true;
//    }
    public static void main(String[] args){
        //System.out.println(recurse(15));
        Student student1;
        Student students = new Student(21,"kthik",34);
        //System.out.println(students.marks);
        Student studentk = new Student("karthik",54);
        //Student studentm = new Student();
        //System.out.println(studentk.marks);
//        System.out.println(studentm.name);
//        System.out.println(studentm.marks);
//        System.out.println(studentm.rollno);
        //studentm.something("something is wrong here");
        //System.out.println(students.name);
        //System.out.println(studentk.name);
//        System.out.println(students.marks);
//        System.out.println(students.rollno);
        Student s1 = new Student(students);
        Student s2= new Student();
        Student s3 = s2;
        s2.name="kunal";
        System.out.println(s3.name); //gives kunal as s2 is changed
//        System.out.println(s1.name);
//        System.out.println(s1.rollno);
//        System.out.println(s1.gpa);
//        System.out.println(s1.marks);

       // System.out.println(students.greeting("Rushik"));
        //students.greeting("r");
    }
}
class Student{
    int rollno;
    String name="maheshh";
    float marks;
    int gpa=10;
    public Student(int rollno, String nam, float marks) {
        //nam = this.name;// nam gives mahesh
        this.name= nam; // nam gives karthik(parameter passed) if above statement not present. If above statement present gives mahesh only.
        this.rollno = rollno;
        this.marks = marks;
       // System.out.println(this.name);

    }
    public Student( String nam, float mark) {
        marks=mark;
        name=nam;
    }
    public void something(String som){
        System.out.println(som);
        String s = "";
        s = s+som;
    }
    public Student(){
        this("rushik",121);

        //something("rushik");
        this.name="rusjss";
        //something(this.name);
        this.rollno=9393;
        this.marks=2272;
//        this.name=name;
//        this.rollno=rollno;
//        this.marks=marks;

    }
    Student(Student deekshith){
        this.name = deekshith.name;
        this.rollno = deekshith.rollno;
        this.marks = deekshith.marks;
        this.gpa=deekshith.gpa;
        //System.out.println(this.gpa);
    }
//    boolean greeting(String name){
//        //System.out.println("my name is "+ name);//name takes the value from parameters as it has no relation with instance variables.
//        System.out.println("my name is"+this.name); //this.name takes the value from the constructor as it points to instance variable
//        return true;
//    }
}

//new keyword

