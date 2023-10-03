package com.demo;

import com.demo.parametrize.Parametrize;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParametrizeTest {
    @ParameterizedTest
    @ValueSource(strings={"radar", "madam"})
    public void palindromTest(String input) {
        assertTrue(Parametrize.isPalindrom(input));
    }
}
