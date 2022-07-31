package com.solo.blog.member;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
    private Long id;
    private MemberType type;
    private String password;
}