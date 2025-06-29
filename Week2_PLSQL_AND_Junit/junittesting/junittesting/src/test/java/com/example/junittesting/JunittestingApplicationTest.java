package com.example.junittesting;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JunittestingApplicationTest {

    @Test
    public void twoplustwoequalfour(){
        JunittestingApplication obj = new JunittestingApplication();
        assertEquals(5, obj.add(2, 3));
        assertTrue(true, String.valueOf(5 > 3));
        assertFalse(false, String.valueOf(5 < 3));
        assertNull(null);
    }
}