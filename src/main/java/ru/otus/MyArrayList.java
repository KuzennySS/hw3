package ru.otus;

import java.util.*;

public class MyArrayList<T> extends AbstractList<T> {

    T[] array;
    private int size;
    private int currentPosition;

    public MyArrayList() {
    }

    public MyArrayList(T[] array) {
        this.array = array;
    }

    @Override
    public T get(int index) {
        return array[index];
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }

    public boolean add(T t){
        grow();
        currentPosition = this.array.length - 1;
        array[currentPosition] = t;
        currentPosition++;
        return true;
    }

    public T set(int index, T t){
        grow();
        currentPosition = this.array.length - 1;
        array[currentPosition] = t;
        currentPosition++;
        return t;
    }

    private T[] grow(){
        return array = Arrays.copyOf(array, size() + 1);
    }
}
