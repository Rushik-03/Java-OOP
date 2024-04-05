package Generics;
import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int size =0;
    public static int default_size=10;

    public CustomArrayList(){
        this.data = new int[default_size];
    }

    public void add(int num){
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
        int[] temp = new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    public int remove(){
        return data[--size];
    }

    public int get(int index){
        return data[index];
    }
    public void set(int index, int num){
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
        CustomArrayList custom = new CustomArrayList();
        custom.add(103);
        custom.add(101);
        custom.add(102);
        custom.add(104);
        System.out.println(custom);
        System.out.println(custom.remove());
        System.out.println(custom);

    }

}
