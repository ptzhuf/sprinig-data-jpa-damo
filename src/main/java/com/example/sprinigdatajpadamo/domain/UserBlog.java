package com.example.sprinigdatajpadamo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_blog")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@IdClass(UserBlogKey.class)
public class UserBlog {
    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Id
    @Column(name = "title", nullable = true, length = 200)
    private String title;
    @Id
    @Column(name = "create_user_id", nullable = true)
    private Integer createUserId;
    @Basic
    @Column(name = "blog_content", nullable = true, length = -1)
    @Lob
    private String blogContent;
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "image", nullable = true)
    @Lob
    private byte[] image;
    @Basic
    @Column(name = "create_time", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Transient
    private String transientSimple;
}
