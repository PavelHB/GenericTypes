package com.company;

import java.util.Arrays;

public class Array <T>{
    private T[] array;

    public Array(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void swap(int index1, int index2){
        if((index1-1>array.length&&index1>=0)||(index2-1>array.length)&&index2>=0){
            throw new ArrayIndexOutOfBoundsException();
        }
        T item = getArray()[index1];
        array[index1] = getArray()[index2];
        array[index2] = item;
    }


    @Override
    public String toString() {
        return "Array{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
