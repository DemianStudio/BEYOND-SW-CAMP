package com.ohgiraffers.section08.uses;

import java.util.UUID;

/* 설명: 회원을 잘 조회하는 클래스 */
public class MemberFinder {

	public Member[] findAllMembers() {
		
		return MemberRepository.findAllMembers();
	}
}
