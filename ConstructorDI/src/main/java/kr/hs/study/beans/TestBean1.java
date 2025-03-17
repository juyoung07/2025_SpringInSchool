package kr.hs.study.beans;

public class TestBean1 {
    private int data1;
    private double data2;
    private String data3;

    public TestBean1() {
        System.out.println("TestBean 기본생성자");
        this.data1 = 1;
        this.data2 = 5.9;
        this.data3 = "yun";
    }

    public TestBean1(int data1) {
        System.out.println("TestBean1의 int형 기본생성자");
        this.data1 = data1;
        this.data2 = 9.5;
        this.data3 = "ju";
    }

    public TestBean1(double data2) {
        System.out.println("TestBean1의 double형 기본생성자");
        this.data1 = 7;
        this.data2 = data2;
        this.data3 = "ju";
    }

    public TestBean1(String data3) {
        System.out.println("TestBean1의 String형 기본생성자");
        this.data1 = 7;
        this.data2 = 6.8;
        this.data3 = data3;
    }

    public void printData() {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        System.out.println("data3 : " + data3);
    }
}
