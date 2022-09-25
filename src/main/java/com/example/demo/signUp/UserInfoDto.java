package com.example.demo.signUp;

import lombok.Getter;
import lombok.Setter;

/**
 * 폼으로 받을 회원정보를 매핑 시켜줄 객체 생성
 */
@Getter
@Setter
public class UserInfoDto {
    private String email;
    private String password;

    private String auth;
}
