package com.solo.blog.post;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Post {
    private Long id;
    private String title;
    private String category;
    private String content;
}