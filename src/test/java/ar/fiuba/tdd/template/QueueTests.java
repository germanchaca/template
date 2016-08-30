package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Created by german on 8/29/2016.
 */
public class QueueTests {
    @Test
    public void queueIsNotEmptyAfterAddingSomeInteger() {
        Queue<Integer> queue = new Queue<>();
        Integer int1 = new Integer(10);
        try {
            queue.add(int1);
        } catch (EmptyException e) {
            e.printStackTrace();
        }

        assertFalse(queue.isEmpty());
    }

    @Test
    public void queueIsEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test(expected = EmptyException.class)
    public void removeEmptyThrowsEmptyException() {
        Queue<Integer> queue = new Queue<>();
        try {
            queue.remove();
        } catch (EmptyException e) {
            fail();
        }
    }

    @Test(expected = EmptyException.class)
    public void topThrowsEmptyException() {
        Queue<Integer> queue = new Queue<>();
        try {
            queue.top();
        } catch (EmptyException e) {
            fail();
        }
    }

    @Test
    public void queueStoresCorrectly() throws EmptyException {
        Queue<Integer> queue = new Queue<>();
        Integer int1 = new Integer(10);
        queue.add(int1);

        Integer topNumber = null;
        try {
            topNumber = queue.top();
        } catch (EmptyException e) {
            e.printStackTrace();
        }

        assertTrue(topNumber.intValue() == int1.intValue());
    }
}
