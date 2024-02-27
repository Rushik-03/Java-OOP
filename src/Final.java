public class Final {
    public static void main(String[] args){
        Integer a =10;
        Integer b =20;
        swap(a,b); //doesnt swap even though objects
        // are passed bu reference because
        //Integer class is declared using
        // final keyword.
        System.out.println(a+" "+b);
        final int bonus =2;//final variables have to be
        // initialized;
        //bonus = 3; // gives an error we cant modify
        // varibales declared using final.
        final Classes cls = new Classes();
        //System.out.println(cls.n);
        //cls.n=20;//eventhough declared with final we can
        // change its fields as it is not primitive datatype and it
        // is an object
        //System.out.println(cls.n);
        Classes np = new Classes();
        //cls = np; //will give error as cls is declared
        // using final cant be reassigned to another object.
        np =cls;
        System.out.println(np.n);
    }

    static void swap(Integer a ,Integer b){
        Integer temp = a;
        a=b;
        b=temp;
    }
}

class Classes{
    int n=7;
    //final int n =7; //will give error if modified.
    int k= 2;
}

