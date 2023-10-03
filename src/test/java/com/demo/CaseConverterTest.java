package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class CaseConverterTest {

    private CaseConverter c;

    @BeforeEach
    public void init(){
        this.c = new CaseConverter();
    }


    static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of("", ""),
                Arguments.of(null, ""),
                Arguments.of("1", "1"),
                Arguments.of("a", "A"),
                Arguments.of("ab1a", "AB1A"),
                Arguments.of("ab1 a", ""),
                Arguments.of("ABC2", "1")
        );
    }

    @ParameterizedTest
    @MethodSource("testData")
    void testCaseConverter(String a, String expected){
        String result = c.convertCase(a);
        assertEquals(expected, result);
    }


}