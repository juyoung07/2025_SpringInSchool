package kr.hs.study.beans;

public class Owner {
    private String name;
    private String addr;

    public void ownerPrint() {
        System.out.println("name : " + name);
        System.out.println("address : " + addr);
    }

    public Owner(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
}
