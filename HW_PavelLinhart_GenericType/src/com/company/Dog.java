package com.company;

public class Dog extends Animal{
    private String nickName;


    public Dog() {
        this.nickName= "";
    }

    public Dog(String name, String nickName) {
        super(name);
        this.nickName= nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}
