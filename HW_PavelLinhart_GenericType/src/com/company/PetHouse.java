package com.company;

import java.util.ArrayList;

public class PetHouse <T extends Animal>{
    private ArrayList<T> arrayList;

    public PetHouse() {
        ArrayList<T> arrayList = new ArrayList<T>();
        this.arrayList = arrayList;
    }

    public PetHouse(ArrayList<T> arrayList) {
        this.arrayList = arrayList;
    }

    public ArrayList<T> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<T> arrayList) {
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

    @Override
    public String toString() {
        return "PetHouse{" +
                "arrayList=" + arrayList +
                '}';
    }
}
