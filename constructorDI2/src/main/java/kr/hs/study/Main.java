package kr.hs.study;

import kr.hs.study.beans.TestBean;
import kr.hs.study.beans.TestBean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        TestBean obj1 = ctx.getBean("t1", TestBean.class);
        obj1.printData();

        System.out.println("------------------------------------");

        TestBean obj2 = ctx.getBean("t2", TestBean.class);
        obj2.printData();

        System.out.println("------------------------------------");

        TestBean2 obj3 = ctx.getBean("t3", TestBean2.class);
        obj3.printData();

        ctx.close();
    }
}