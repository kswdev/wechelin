package com.wechelin.member.domain.model.vo;

import jakarta.persistence.Embeddable;

@Embeddable
public class IDName {

    private String id;
    private String name;

    public static IDName create(String id, String name) {
        return new IDName(id, name);
    }

    private IDName(String id, String name) {
        this.id = id;
        this.name = name;
    }

    protected IDName() {}
}
