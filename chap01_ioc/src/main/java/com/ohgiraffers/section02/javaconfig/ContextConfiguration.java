package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection02") // Configuration : 설정정보를 관리하는 어노텐션
public class ContextConfiguration {

    @Bean(name = "member")
    public MemberDTO getMember(){
        return new MemberDTO(1, "user02", "pass", "홍길동");
    }
}
