package com.example.sprinigdatajpadamo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    /**
     * 名字.
     */
    private String name;
    /**
     * 邮件.
     */
    private String email;
    /**
     * 性别.
     */
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
