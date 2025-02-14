/* 수업목표: 스트림의 최종연산 중 하나인 calculating에 대해 이해하고 사용할 수 있다. */
package com.ohgiraffers.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        long count = IntStream.range(1, 10).count();    // 1부터 10직전(9)까지의 수
        long sum = IntStream.range(1, 10).sum();        // 1부터 10직전(9)까지의 합

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);

        /* 설명: OptionalInt는 결과 없을을 나타내야 하는 명화한 요구가 있는 메소드 반환 형식으로 사용하기 위한 타입이다. */
        OptionalInt max = IntStream.range(1, 10).max();
        OptionalInt max2 = IntStream.range(1, 1).max();  // OptionalInt.empty 형태로 나오고 기본자료형에서 존재하지 않음을 나타내기 위함을 알 수 있다.
        OptionalInt min = IntStream.range(1, 10).min();

        System.out.println("max = " + max);
        System.out.println("max2 = " + max2);
        System.out.println("min = " + min);

        int oddSum = IntStream.range(1, 10).filter(i -> i % 2 == 1).sum();
        long oddCount = IntStream.range(1, 10).filter(i -> i % 2 == 1).count();
        System.out.println("oddSum = " + oddSum);
        System.out.println("oddCount = " + oddCount);
    }
}
