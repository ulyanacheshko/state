package com.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.StateContext;
import org.junit.Before;
import org.junit.Test;

public class StateMachineTest {
    StateContext sc;

    @Before
    public void setUp() {
        sc = new StateContext();
    }
    //Test Sequence: none
    @Test
    public void test_0() {
        assertFalse(sc.isAccept());
    }
    //Test Sequence: A
    @Test
    public void test_1() {
        sc.actionA();
        assertTrue(sc.isAccept());
    }
    //Test Sequence: B
    @Test
    public void test_2() {
        sc.actionB();
        assertTrue(sc.isAccept());
    }
    //Test Sequence: ABABA

    @Test
    public void test_3() {
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
        sc.actionB();
        assertFalse(sc.isAccept());
        sc.actionA();
        assertTrue(sc.isAccept());
    }
    //Test Sequence: BAB
    @Test
    public void test_4() {
        sc.actionB();
        sc.actionA();
        sc.actionB();
        assertTrue(sc.isAccept());
    }
    //Test Sequence: AAB
    @Test
    public void test_5() {
        sc.actionA();
        sc.actionA();
        sc.actionB();
        assertFalse(sc.isAccept());
    }
    // Test Sequence: BAA
    @Test
    public void test_6() {
        sc.actionB();
        sc.actionA();
        sc.actionA();
        assertFalse(sc.isAccept());
    }
}