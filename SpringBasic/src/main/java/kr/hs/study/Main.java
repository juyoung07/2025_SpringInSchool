package kr.hs.study;
import kr.hs.study.beans.TestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // config.xml파일을 로딩해서 객체를 생성하고 보관
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");

        // 객체를 가져와서 주소값 출력
//        TestBean obj1 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj1 : " + obj1);
//
//        TestBean obj2 = ctx.getBean("t1", TestBean.class);
//        System.out.println("obj2 : " + obj2);
//        System.out.println("------------------------------------");
        // 주소가 동일함... 싱글톤

//        TestBean obj3 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj3 : " + obj3);
//        TestBean obj4 = ctx.getBean("t2", TestBean.class);
//        System.out.println("obj4 : " + obj4);
        // 주소값이 다름 -> 객체를 새로 만들었다는 얘기..



        ctx.close();
    }
}