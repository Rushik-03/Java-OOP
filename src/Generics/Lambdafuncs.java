package Generics;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafuncs {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0;i<5;i++){
//            arr.add(i+1);
//        }
//        arr.forEach((item)-> System.out.println(item*2));

//        Consumer<Integer> func = (item)-> System.out.println(item*2);
//        arr.forEach(func); // Consumer is an interface. forEach() method takes this as parameter.

        Operation sum = (a,b)->a+b;
        Operation diff = (a,b)->a-b;
        Operation product = (a,b)->a*b;
        Lambdafuncs lamdi =  new Lambdafuncs();
        System.out.println(lamdi.operate(5,9,sum));
        System.out.println(lamdi.operate(5,9,product));
        System.out.println(lamdi.operate(5,9,diff));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);
//    int ans(int k); // if more than one method then cant use lambda functions.
}
