package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        TestBean1 obj = ctx.getBean("t1", TestBean1.class);
        System.out.println("data1 : " + obj.getData1());
        System.out.println("data2 : " + obj.getData2());
        System.out.println("data3 : " + obj.getData3());

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("obj2's Data1 : " + obj2.getData1());

        ctx.close();
    }
}