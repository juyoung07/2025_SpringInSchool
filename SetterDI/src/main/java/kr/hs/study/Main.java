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
        System.out.println("Data1 : " + obj1.getData1());
        System.out.println("Data2 : " + obj1.getData2());
        System.out.println("Data3 : " + obj1.isData3());
        System.out.println("Data4 : " + obj1.getData4());

        TestBean2 obj2 = ctx.getBean("t2", TestBean2.class);
        System.out.println("Data1 : " + obj2.getData1());
        System.out.println("Data2 : " + obj2.getData2());

        ctx.close();
    }
}