package org.example;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void fibonacciRecurse() {
        assertEquals(0, Main.fibonacciRecurse(0));
        assertEquals(1, Main.fibonacciRecurse(1));
        assertEquals(8, Main.fibonacciRecurse(6));
        assertEquals(832040, Main.fibonacciRecurse(30));
    }
}