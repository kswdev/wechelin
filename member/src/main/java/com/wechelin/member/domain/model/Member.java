package com.wechelin.member.domain.model;

import com.wechelin.member.domain.model.vo.*;
import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Member {

    @EmbeddedId
    private final MemberNo no = MemberNo.create();

    @Embedded private IDName idName;
    @Embedded private Password password;
    @Embedded private Email email;

    private boolean active;
    private Set<Role> roles = new HashSet<>();

    public Member register(String id, String name, String password, String email) {
        IDName newIdName = IDName.create(id, name);
        Password newPassword = Password.create(password);
        Email newEmail = Email.create(email);

        return new Member(newIdName, newPassword, newEmail, true);
    }

    public Member(IDName idName, Password password, Email email, boolean active) {
        this.idName = idName;
        this.password = password;
        this.email = email;
        this.active = active;
        this.roles.add(Role.USER);
    }

    protected Member() {}
}
