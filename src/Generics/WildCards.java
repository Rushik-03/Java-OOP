package Generics;
import java.util.*;
// In the below class it does even more type checking as it allows only subclasses of Number
// and no other classes can be used other than those. So we cant use String or others.
public class Wildcards<T extends Number> {
    private Object[] data;
    private int size =0;
    public static int default_size=10;

    public void getList(List<Number> list){
        //here we can pass only Number type.
    }
    public void getList2(List<? extends Number> list){
        //here we can pass subclasses of Number not only just Number class.
    }
    public Wildcards(){

        this.data = new Object[default_size];
    }

    public void add(T num){
        if(isfull()){
            resize();
        }
//        System.out.println(size);
        data[size++] = num;
        System.out.println(size);
    }
    public boolean isfull(){
        return size == data.length;
    }
    public void resize(){
        Object[] temp = new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public T remove(){
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index){
        return (T)data[index];
    }
    public void set(int index, T num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList list2 = new ArrayList(); // We can add anytype to this arraylist.
//        list.add(123);
//        list2.add("string");
//        list2.add('c');
//        list2.add(104);
//        System.out.println(list);
//        System.out.println(list2);
        Wildcards<Integer> custom = new Wildcards<>();
        custom.add(103);
        custom.add(101);
        custom.add(102);
        custom.add(104);
        System.out.println(custom);
        System.out.println(custom.remove());
        System.out.println(custom);

    }

}
