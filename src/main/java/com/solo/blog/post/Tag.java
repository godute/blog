package com.solo.blog.post;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Tag {
    private String id;
    private String name;
    private String postId;
}
