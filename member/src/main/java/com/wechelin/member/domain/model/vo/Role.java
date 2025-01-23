package com.wechelin.member.domain.model.vo;

import lombok.Getter;

public enum Role {

    USER("ROLE_USER"),
    ADMIN("ROLE_ADMIN");

    @Getter
    private final String name;

    Role(String name) {
        this.name = name;
    }
}
