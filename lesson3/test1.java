package lesson3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class test1 {

    @Test
    /* проверям, является ли число четным */
    void checkEvenNumber() {
        assertTrue(task1.evenOddNumber(4));
    }

    /*
     * проверяем, является ли число нечетным
     */
    @Test
    void checkOddNumber() {
        assertFalse(task1.evenOddNumber(3));
    }

}
