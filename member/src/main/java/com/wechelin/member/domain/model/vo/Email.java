package com.wechelin.member.domain.model.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    private String address;

    public static Email create(String address) {
        return new Email(address);
    }

    private Email(String address) {
        this.address = address;
    }

    protected Email() {}
}
