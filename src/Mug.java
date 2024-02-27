public class Mug {

    private String contents;
     public Mug(String contents) {
         this.contents = contents;
     }
     public void setContents(String contents) {
         this.contents = contents;
     }

     public String getContents() {
         return contents;
     }
    public static void main(String args[]){
        int foo = 13;
        System.out.println(foo); // this will print "13"

        setFoo(foo);
        System.out.println(foo); // this will still print "13"
    }

    public static void setFoo(int bar){
        bar = 2; // doesnt change the original as the parameter passed here is copy of original.
    }
}
