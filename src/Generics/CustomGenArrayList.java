package Generics;
import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private int size =0;
    public static int default_size=10;

    public CustomGenArrayList(){

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
        CustomGenArrayList<Integer> custom = new CustomGenArrayList<>();
        custom.add(103);
        custom.add(101);
        custom.add(102);
        custom.add(104);
        System.out.println(custom);
        System.out.println(custom.remove());
        System.out.println(custom);

    }

}
