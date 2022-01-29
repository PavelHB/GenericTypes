package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library <T extends Media> {
    private ArrayList<T> arrayList;
    public Library() {
        ArrayList<T> arrayList = new ArrayList<T>();
        this.arrayList = arrayList;
    }
    public Library(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public void add(T item){
        arrayList.add(item);
    }

    public void remove(T item){
        arrayList.remove(item);
    }

    public void remove(int item){
        arrayList.remove(item);
    }

    public T get(int i){
        return arrayList.get(i);
    }

    public void display(){
        for (T item : arrayList) {
            System.out.println(item);
        }
    }



}
