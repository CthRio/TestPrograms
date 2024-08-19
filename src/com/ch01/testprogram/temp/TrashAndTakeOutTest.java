package com.ch01.testprogram.temp;

import com.ch01.testprogram.temp.TrashAndTakeOut;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TrashAndTakeOutTest {

    @Test
    public void testTrashAndTakeOut() {
        assertEquals(192, TrashAndTakeOut.trash(10));
    }

    @Test
    public void testTrashAndTakeOutWithNegativeInput() {
        assertEquals(0, TrashAndTakeOut.trash(-5));
    }

    @Test
    public void testTakeOut() {
        assertEquals(280, TrashAndTakeOut.takeOut(6, 14));
    }

    @Test
    public void testTakeOutWithZeroInput() {
        assertEquals(14, TrashAndTakeOut.takeOut(0, 14));
    }
}
