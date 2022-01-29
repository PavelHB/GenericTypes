package com.company;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Integer [] intArray = new Integer[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= random.nextInt(100);
        }
        System.out.println("Random Integer Array: ");
        System.out.println(Arrays.toString(intArray));
        Array<Integer> integerArray = new Array<>(intArray);
        System.out.println("Random Integer Array as generic type: ");
        System.out.println(integerArray);
        System.out.println("Swapped element with indexes 5, 2");
        try {
            integerArray.swap(5, 2);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: some index is out of bound");
        }
        System.out.println(integerArray);
        Float[] flArray= new Float[10];
        for (int i = 0; i < flArray.length; i++) {
            flArray[i]= random.nextFloat()*1000;
        }
        System.out.println("Random Float Array: ");
        System.out.println(Arrays.toString(flArray));
        Array<Float> floatArray = new Array<>(flArray);
        System.out.println("Random Float Array as generic type: ");
        System.out.println(floatArray);
        System.out.println("Swapped element with indexes 1, 9");

        try {
            floatArray.swap(1, 9);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: some index is out of bound");
        }
        System.out.println(floatArray);

        Books books = new Books();
        System.out.println(books);
        Newspapers newspapers = new Newspapers();
        System.out.println(newspapers);
        Movies movies = new Movies();
        System.out.println(movies);
        System.out.println("Library of Books: ");
        Library<Books> booksLibrary = new Library<>();
        booksLibrary.add(books);
        Books books1 = new Books("Kniha", LocalDate.of(2012,12,1),"BookCompany","author");
        booksLibrary.add(books1);
        booksLibrary.display();

        System.out.println("Library of News: ");
        Library<Newspapers> newsLibrary = new Library<>();
        newsLibrary.add(newspapers);
        Newspapers newspapers1 = new Newspapers("Newspaper1",LocalDate.of(2022,1,29),"Blesk");
        newsLibrary.add(newspapers1);
        booksLibrary.display();

        System.out.println("Library of Movies: ");
        Library<Movies> moviesLibrary = new Library<>();
        moviesLibrary.add(movies);
        Movies movies1 = new Movies("Film",LocalDate.of(2020,1,2),
                "Paramont","Names of directors","Names of actors");
        moviesLibrary.add(movies1);
        moviesLibrary.display();

        System.out.println("Library of Media: ");
        Library<Media> mediaLibrary = new Library<>();
        mediaLibrary.add(books);
        mediaLibrary.add(books1);
        mediaLibrary.add(newspapers);
        mediaLibrary.add(newspapers1);
        mediaLibrary.add(movies);
        mediaLibrary.add(movies1);
        mediaLibrary.display();

        Dog dog = new Dog("Pes","Alík");
        Dog dog1 = new Dog("Pes","Rex");
        Cat cat = new Cat("Kočka","Mikeš");
        Cat cat1 = new Cat("Kočka","Garfield");
        PetHouse<Animal> animalPetHouse = new PetHouse<>();
        animalPetHouse.add(dog);
        animalPetHouse.add(dog1);
        animalPetHouse.add(cat);
        animalPetHouse.add(cat1);
        System.out.println("There are these animals in Pethouse : ");
        //System.out.println(animalPetHouse);
        animalPetHouse.display();










    }
}
