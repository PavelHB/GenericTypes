package com.company;

public class Cat extends Animal{
    private String nickName;

    public Cat() {
        this.nickName= "";
    }

    public Cat(String name, String nickName) {
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
        return "Cat{" +
                "nickName='" + nickName + '\'' +
                '}';
    }
}

