package Array_List;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(67);
//        list.add(56);
//        list.add(15);
//        list.add(48);
//        list.add(45);
//        list.add(67);
//        list.add(56);
//        list.add(15);
//        list.add(48);
//        list.add(45);
//        list.add(67);
//        list.add(56);
//        list.add(15);
//        list.add(48);
//        list.add(45);
//        System.out.println(list);
//        System.out.println(list.get(10));
        Scanner sc = new Scanner(System.in);

        //input
        for (int i = 0; i <5 ; i++) {
        list.add(sc.nextInt());
        }

        //output
        System.out.println(list);
    }
}

// syntax
/*
* ArrayList<Integer> list = new ArrayList<Datatype>();
* at the field of datatype - putting datatype is not mandatory
* arraylist is a class
* after list , when we use '.' operation we can perform many things
* we can add as many things as we need - it never gets full
* */
