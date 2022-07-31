package com.solo.blog.post;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Comment {
    private Long timestamp;
    private String content;
    private String memberId;
    private String postId;
}
