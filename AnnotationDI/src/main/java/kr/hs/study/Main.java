package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        TestBean1 obj = ctx.getBean("t1", TestBean1.class);
        System.out.println(obj.getData1());
        System.out.println(obj.getData2());
        System.out.println(obj.getData3());

        ctx.close();
    }
}