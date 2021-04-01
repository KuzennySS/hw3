package ru.otus;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> myList = new MyArrayList<>(new Integer[]{1, 2, 3});

        // toString
        System.out.println(myList);
        // get
        System.out.println(myList.get(1));
        // size
        System.out.println(myList.size());
        // add
        myList.add(4);
        System.out.println(myList);
        // Collections.addAll()
        Collections.addAll(myList, 5, 6, 7);
        System.out.println(myList);
        // Collections.copy()
        Collections.copy(myList, List.of(8, 9, 10));
        System.out.println(myList);
        // Collections.sort


//        public static <T> void sort(List<T> list, Comparator<? super T> c) {
//        }
    }
}
