package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test2 {

    @Test
    /* попадает ли число в интервал */
    void checkNumberInInterval() {
        assertTrue(task2.numberInInterval(25));
        assertTrue(task2.numberInInterval(100));
    }

    @Test
    /* число не попадает в интервал */
    void checkNumberNotInInterval() {
        assertFalse(task2.numberInInterval(24));
        assertFalse(task2.numberInInterval(101));
    }

}
