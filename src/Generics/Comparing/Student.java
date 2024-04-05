package Generics.Comparing;

public class Student implements Comparable<Student>{
    int roll;
    float marks;
   public Student(int roll, float marks){
       this.roll = roll;
       this.marks= marks;
   }

    @Override
    public String toString() {
        return marks+"";
    }

    @Override
   public int compareTo(Student o) { // used to compare two objects.
       float k = this.marks - o.marks;
       System.out.println(k);
       int diff = (int)(this.marks - o.marks);
//       int diff = Float.compare(this.marks,o.marks);
       // if diff==0 means both are equal.
       //if diff<0 means o is greater. else if diff>0 means o is smaller than current object.
       return diff;
   }
}
