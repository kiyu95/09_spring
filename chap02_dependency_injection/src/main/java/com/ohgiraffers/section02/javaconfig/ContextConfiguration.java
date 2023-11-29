package com.ohgiraffers.section02.javaconfig;


import com.ohgiraffers.common.Account;
import com.ohgiraffers.common.MemberDTO;
import com.ohgiraffers.common.PersonalAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean
    public Account accountGenerator(){
        return new PersonalAccount(20, "110-233-2222");
    }

    @Bean
    public MemberDTO memberGenerator(){
        MemberDTO member = MemberDTO.builder()
                .seq(30)
                .email("hong23@gmail.com")
                .name("홍석삼")
                .personalAccount(accountGenerator()) // accountGenerator가 필요하므로 위의 메소드에서 참조 (DI)
                .phone("010-2323-3333").build();

        return member;
    }
}
