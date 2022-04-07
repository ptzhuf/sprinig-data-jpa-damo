package com.example.sprinigdatajpadamo.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserBlogKey implements Serializable {
    private String title;
    private Long createUserId;
}
