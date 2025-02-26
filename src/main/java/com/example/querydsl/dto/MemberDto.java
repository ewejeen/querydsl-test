package com.example.querydsl.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class MemberDto {
    private String username;
    private String age;

    public MemberDto(String username, String age) {
        this.username = username;
        this.age = age;
    }
}
