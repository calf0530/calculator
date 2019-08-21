package com.example.calculator;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Hyemin22Test {

    @Test
    public void test_음수덧셈() {
        Calculator calc = new Calculator();
        int result = calc.add(-5,-4);

        assertEquals("add 함수의 결과는 -9이여야 합니다.",-9, result);
    }
}
