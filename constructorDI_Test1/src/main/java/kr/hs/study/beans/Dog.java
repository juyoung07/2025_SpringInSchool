package kr.hs.study.beans;

import kr.hs.study.Animal;

public class Dog implements Animal {
    private String color;
    private int leg;
    private String name;

    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    @Override
    public void go() {
        System.out.println("뚱땅뚱땅");
    }

    public void printDog() {
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        System.out.println("name : " + name);
    }

    public Dog(String color, int leg, String name) {
        this.color = color;
        this.leg = leg;
        this.name = name;
    }
}
