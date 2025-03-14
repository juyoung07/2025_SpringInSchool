package kr.hs.study.beans;

public class TestBean {
    public TestBean() {
        System.out.println("TestBean 기본 생성자");
    }

    public void initMethod() {
        System.out.println("TestBean initMethod");
    }

    public void destroyMethod() {
        System.out.println("TestBean destroyMethod");
    }
}
