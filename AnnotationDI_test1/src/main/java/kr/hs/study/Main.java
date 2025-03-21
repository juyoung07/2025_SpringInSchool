package kr.hs.study;

import kr.hs.study.beans.Member;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config_annotation.xml");

        Member obj1 = ctx.getBean("t1", Member.class);
        System.out.print(obj1.getName() + ", ");
        System.out.print(obj1.getNickName() + ", ");
        System.out.print(obj1.getAddr() + ", ");
        System.out.print(obj1.getHobby().getHobby());
        
        ctx.close();
    }
}