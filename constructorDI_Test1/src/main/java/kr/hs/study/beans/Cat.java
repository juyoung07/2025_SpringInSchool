package kr.hs.study.beans;

import kr.hs.study.Animal;

public class Cat implements Animal {
    private String color;
    private int leg;
    private Owner owner;

    @Override
    public void eat() {
        System.out.println("챱챱");
    }

    @Override
    public void go() {
        System.out.println("뚜벅뚜박");
    }

    public void printCat() {
        System.out.println("color : " + color);
        System.out.println("leg : " + leg);
        owner.ownerPrint();
    }

    public Cat(String color, int leg, Owner owner) {
        this.color = color;
        this.leg = leg;
        this.owner = owner;
    }
}
