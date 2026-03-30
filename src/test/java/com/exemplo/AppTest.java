package com.exemplo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testeSoma() {
        assertEquals(2, App.soma(1, 1));
    }

    @Test
    void testeFalho() {
        assertEquals(4, App.soma(2, 2)); // erro
    }
}
