package at.fhj.iit;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class StringQueueTest {

    public StringQueue q;
    @Before
    public void setUp() throws Exception {
        q=new StringQueue(5);
    }

    @Test (expected = NoSuchElementException.class)
    public void testIsEmpty() {
        q.element();
    }

    @Test
    public void testAddElements() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));

    }

    @Test
    public void testOverflow() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));
        Assert.assertFalse(q.offer("Obj6"));
    }

    @Test
    public void testPeekElement() {
        q.offer("Obj1");
        q.offer("Obj2");
        q.offer("Obj3");
        Assert.assertEquals("Obj1", q.peek());
    }

    @Test
    public void test5() {
    }

    @Test
    public void test6() {
    }

    @Test
    public void test7() {
    }

    @Test
    public void test8() {
    }

    @Test
    public void test9() {
    }

    @Test
    public void test10() {
    }

    @After
    public void tearDown() throws Exception {

    }
}
