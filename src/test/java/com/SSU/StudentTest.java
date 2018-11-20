package com.SSU;

import junit.framework.TestCase;

public class StudentTest extends TestCase {
    private final Student studentTest = new Student(1,"Sam",9);

    public void testGetId() {
        assertEquals(studentTest.getId(),1);
    }

    public void testGetName() {
        assertEquals(studentTest.getName(),"Sam");
    }

    public void testGetYear() {
        assertEquals(studentTest.getYear(),9);
    }

    public void testGetFeesPaid() {
        assertEquals(studentTest.getFeesPaid(),0);
    }

    public void testGetFeesTotal() {
        assertEquals(studentTest.getFeesTotal(),9000);
    }

    public void testGetRemainingFees() {
        assertEquals(studentTest.getRemainingFees(),9000);
    }
}