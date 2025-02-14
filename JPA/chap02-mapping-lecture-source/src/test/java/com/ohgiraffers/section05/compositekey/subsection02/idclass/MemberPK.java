package com.ohgiraffers.section05.compositekey.subsection02.idclass;

import java.io.Serializable;
import java.util.Objects;

/* 설명: IdClass 타입으로 쓰인 클래스도 1차 캐시에서 식별자로 쓰이는 객체 이므로 (equals + hashCode)를 오버라이딩 한다. */
public class MemberPK implements Serializable {
    private int memberNo;
    private String memberId;


    public MemberPK() {
    }

    public MemberPK(int memberNo, String memberId) {
        this.memberNo = memberNo;
        this.memberId = memberId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemberPK memberPK)) return false;
        return memberNo == memberPK.memberNo && Objects.equals(memberId, memberPK.memberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberNo, memberId);
    }
}
