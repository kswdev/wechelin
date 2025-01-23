package com.wechelin.member.domain.model.vo;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.UUID;

@Embeddable
public class MemberNo {

    private String no;

    protected MemberNo() {}

    private MemberNo(String no) {
        this.no = no;
    }

    public static MemberNo create() {
        UUID uuid = UUID.randomUUID();
        String year = String.valueOf(LocalDate.now().getYear());
        String no = year + '_' + uuid;
        return new MemberNo(no);
    }
}
