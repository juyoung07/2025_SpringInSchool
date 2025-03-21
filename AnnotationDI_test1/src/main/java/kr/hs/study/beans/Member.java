package kr.hs.study.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("t1")
public class Member {
    @Value("Kim")
    private String name;

    @Value("nickKim")
    private String nickName;

    @Value("seoul")
    private String addr;

    @Autowired
    @Qualifier("h1")
    private Hobby hobby;

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public String getAddr() {
        return addr;
    }

    public Hobby getHobby() {
        return hobby;
    }
}
