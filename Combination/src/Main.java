//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }
    public static void memberUse1() {
        Member m1 = new Member();   // private으로 했을 때, 에러가 남
    }

    // 약한 결합
    public static void memberUse2(Member m) { // private으로 하면 실행이 안됨
        Member m2 = m;
    }
}



class Member {
    String name;
    String nickName;

    private Member() {}
}