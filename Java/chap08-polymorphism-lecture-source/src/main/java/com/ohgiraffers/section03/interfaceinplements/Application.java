/* 수업목표: 인터페이스(interface)에 대해 이해할 수 있다. */
/* 필기
    # 인터페이스란?
    - 자바의 클래스와 유사한 형태지만 추상메소드(public abstract)와 상수 필드(public static final)만 가질 수 있는 클래스의 변형체이다.
*/
/* 설명: 추상클래스와 인터페이스의 차이는 면접 단골 질문이니 잘 알고 정리해 두자. */
package com.ohgiraffers.section03.interfaceinplements;

public class Application {
    public static void main(String[] args) {
//        InterProduct ip1 = new InterProduct();      생성자가 없는 인터페이스는 객체 생성 X
        InterProduct ip2 = new Product();           // 다만, 타입으로 활용이 가능하다.(다형성 가능) <- 타입은닉

        /* 필기
            # 정보 은닉
            - 필드, 메소드 은닉(캡슐화)
            - 타입 은닉(다형성)
            - 구현 은닉(다형성, 오버라이딩)
        */


    }
}
