package com.wechelin.member.domain.model.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Password {

    private String password;

    public static Password create(String password) {
        return new Password(password);
    }

    private Password(String password) {
        this.password = password;
    }

    protected Password() {}
}
