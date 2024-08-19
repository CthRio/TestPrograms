package com.ch01.testprogram.T1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalTest {
    @Test
    public void testValidDates1() {
        assertEquals(1, Cal.daysBetweenDates(5, 9, 5, 10, 2024));
    }

    @Test
    public void testValidDates2() {
        assertEquals(37, Cal.daysBetweenDates(2, 2, 3, 10, 2024));
    }

    @Test
    public void testValidDates3() {
        assertEquals(31, Cal.daysBetweenDates(1, 1, 2, 1, 2024));
    }

    @Test
    public void testInvalidStartDate() {
        assertEquals(-1, Cal.daysBetweenDates(2, 30, 5, 10, 2024));
    }

    @Test
    public void testInvalidEndDate() {
        assertEquals(-1, Cal.daysBetweenDates(5, 9, 2, 30, 2024));
    }

    @Test
    public void testStartDateAfterEndDate() {
        assertEquals(-1, Cal.daysBetweenDates(5, 11, 5, 10, 2024));
    }
}
