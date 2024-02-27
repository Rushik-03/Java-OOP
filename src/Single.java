public class Single {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println(obj);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj3);

    }
}
