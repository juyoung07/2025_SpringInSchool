//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // 무조건 제일 먼저 실행해야 되기 때문에 static이 붙음
    public static void main(String[] args) {
        HelloWorldKr hello = new HelloWorldKr();
        callMethod(hello);

    }
    // static은 객체 생성 없이 메소드 사용 가능
    public static void callMethod(HelloWorldKr h1) {
        h1.sayHello();
    }
}