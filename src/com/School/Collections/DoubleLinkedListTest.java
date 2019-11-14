package com.School.Collections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoubleLinkedListTest {

    private DoubleLinkedList<String> list;

    @BeforeEach
    void setUp() {
        list = new DoubleLinkedList<>();
    }

    @Test
    void testShouldGetInsertedElements() {
        list.add("a");
        list.add("b");
        list.add("c");
        Assertions.assertEquals("a", list.get(0));
        Assertions.assertEquals("b", list.get(1));
        Assertions.assertEquals("c", list.get(2));
    }

    @Test
    void testShouldGetANullElement(){
        assertNull(list.get(0));
    }

    @Test
    void testShouldGetANullElements(){
        list.add("a");
        list.add("b");
        assertNull(list.get(2));
    }
    @Test
    void testShouldGetInsertedInTheMiddleElements() {
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(1, "x");
        Assertions.assertEquals("a", list.get(0));
        Assertions.assertEquals("x", list.get(1));
        Assertions.assertEquals("b", list.get(2));
    }

    @Test
    void testShouldGetInsertInTheFirstElement() {
        list.add("a");
        list.add("b");
        list.add(0, "x");
        Assertions.assertEquals("x", list.get(0));
        Assertions.assertEquals("a", list.get(1));
        Assertions.assertEquals("b", list.get(2));
    }

    @Test
    void testShouldGetInsertInTheLastElement() {
        list.add("a");
        list.add("b");
        list.add(1, "x");
        Assertions.assertEquals("a", list.get(0));
        Assertions.assertEquals("x", list.get(1));
        Assertions.assertEquals("b", list.get(2));
    }

    @Test
    void testShouldGetInsertNextElementWithIndex() {
        list.add("a");
        list.add("b");
        list.add(2, "x");
        Assertions.assertEquals("a", list.get(0));
        Assertions.assertEquals("b", list.get(1));
        Assertions.assertEquals("x", list.get(2));
    }

    @Test
    void testShouldGetInsertAnElementInANullPosition() {
        list.add("a");
        list.add("b");
        list.add(10, "x");
        Assertions.assertEquals("a", list.get(0));
        Assertions.assertEquals("b", list.get(1));
        assertNull(list.get(10));
    }

    @Test
    void testShouldGetInsertAnElementInANullPositionWithoutAnyElement(){
        list.add(10, "x");
        assertNull(list.get(10));
    }
}