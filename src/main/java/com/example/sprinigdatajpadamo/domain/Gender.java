package com.example.sprinigdatajpadamo.domain;

public enum Gender {
    MAIL("男性"), FMALL("女性");
    private String value;

    private Gender(String value) {
        this.value = value;
    }
}
