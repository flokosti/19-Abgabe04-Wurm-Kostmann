package at.fhj.iit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.NoSuchElementException;

/**
 * JUnit tests for a StringQueue
 */
public class StringQueueTest {

    public StringQueue q;

    /**
     * Initializing StringQueue with 5 Elements
     */
    @Before
    public void setUp() {
        q = new StringQueue(5);
    }

    /**
     * Test if adding Elements works correctly
     */
    @Test
    public void testOfferAddElements() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));

    }

    /**
     * Test overflow from StringQueue
     */
    @Test
    public void testOfferOverflow() {
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertTrue(q.offer("Obj5"));
        Assert.assertFalse(q.offer("Obj6"));
    }

    /**
     * Test if poll returns first element
     * Also if poll deletes it
     */
    @Test
    public void testPoll() {
        q.offer("Obj1");
        Assert.assertEquals("Obj1", q.poll());
        Assert.assertNull(q.peek());
    }

    /**
     * Test if remove works with max Queue size
     */
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

    /**
     * Test if remove throws exception if Queue is empty
     */
    @Test(expected = NoSuchElementException.class)
    public void testRemoveFromEmptyQueue() {
        q.remove();
    }

    /**
     * Test if peek returns the first added element
     */
    @Test
    public void testPeekElement() {
        q.offer("Obj1");
        q.offer("Obj2");
        q.offer("Obj3");
        Assert.assertEquals(q.peek(), "Obj1");
    }

    /**
     * Check if peek returns null if queue is empty
     */
    @Test
    public void testGetPeekFromEmptyQueue() {
        Assert.assertEquals(null, q.peek());
    }

    /**
     * Test if NoSuchElementException is thrown, if queue is empty.
     */
    @Test(expected = NoSuchElementException.class)
    public void testGetElementFromEmptyQueue() {
        q.element();
    }

    /**
     * Test if element method returns peek element.
     */
    @Test
    public void testGetElement() {
        q.offer("Obj1");
        Assert.assertEquals("Obj1", q.element());
    }

    /**
     * Change size of queue and add elements.
     */
    @Test
    public void testChangeQueueSize() {
        q = new StringQueue(4);
        Assert.assertTrue(q.offer("Obj1"));
        Assert.assertTrue(q.offer("Obj2"));
        Assert.assertTrue(q.offer("Obj3"));
        Assert.assertTrue(q.offer("Obj4"));
        Assert.assertFalse(q.offer("Obj5"));
    }

    /**
     * Reset queue to null.
     */

    @After
    public void tearDown(){
        q=null;
        Assert.assertNull(q);
    }
}
