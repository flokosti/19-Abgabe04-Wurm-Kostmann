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
        q = new StringQueue(5);
    }

    @Test
    public void testOfferAddElements() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));

    }

    @Test
    public void testOfferOverflow() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));
        Assert.assertFalse(q.offer("Obj6"));
    }

    @Test
    public void testPoll() {
        q.offer("Obj1");
        Assert.assertEquals("Obj1", q.poll());
    }


    @Test
    public void testRemoveElement() {
        q.offer("Obj1");
        q.offer("Obj2");
        q.offer("Obj3");
        q.offer("Obj4");
        q.offer("Obj5");

        Assert.assertEquals("Obj1", q.remove());
        Assert.assertEquals("Obj2", q.remove());
        Assert.assertEquals("Obj3", q.remove());
        Assert.assertEquals("Obj4", q.remove());
        Assert.assertEquals("Obj5", q.remove());
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveFromEmptyQueue() {
        q.remove();
    }

    @Test
    public void testPeekElement() {
        q.offer("Obj1");
        q.offer("Obj2");
        q.offer("Obj3");
        Assert.assertEquals(q.peek(), "Obj1");
    }

    @Test
    public void testGetPeekFromEmptyQueue() {
        Assert.assertEquals(null, q.peek());
    }

    @Test(expected = NoSuchElementException.class)
    public void testGetElementFromEmptyQueue() {
        q.element();
    }

    @Test
    public void testGetElement() {
        q.offer("Obj1");
        Assert.assertEquals("Obj1", q.element());
    }

    @Test
    public void testChangeQueueSize() {
        q = new StringQueue(4);
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertFalse(q.offer("Obj5"));
    }

    @After
    public void tearDown() throws Exception {
        q=null;
        Assert.assertNull(q);
    }
}
