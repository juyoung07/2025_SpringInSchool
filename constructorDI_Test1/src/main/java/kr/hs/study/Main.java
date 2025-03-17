package kr.hs.study;

import kr.hs.study.beans.Cat;
import kr.hs.study.beans.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        Dog d1 = ctx.getBean("d1", Dog.class);
        d1.eat();
        d1.go();
        d1.printDog();

        System.out.println("---------------------------");

        Cat c1 = ctx.getBean("c1", Cat.class);
        c1.eat();
        c1.go();
        c1.printCat();
    }
}