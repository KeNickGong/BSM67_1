package com.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestVoidMethodTestCase {
    TestVoidMethod tv = new TestVoidMethod();

    @BeforeEach
    public void init() {
        tv.add("Apple");
        tv.add("Banana");
    }

    @Test
    public void tv() {
        assertEquals(2, tv.size());
    }
}
