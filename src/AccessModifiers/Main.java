package AccessModifiers;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[5] = 909;
        Private obj = new Private(10,99);
        Private obj2 = new Private(10,99);
        Private obj3 = obj2;
        if(obj3 == obj2){
            System.out.println("This is statement 3");
        }
        if(obj == obj2){
            System.out.println("This is statement 1");
        }
        System.out.println(obj == obj2);
        System.out.println(obj.equals(obj2));
        if(obj.equals(obj2)){
            System.out.println("This is statement 2");
        }
    }
}

