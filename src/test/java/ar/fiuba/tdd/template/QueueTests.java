package ar.fiuba.tdd.template;

import ar.fiuba.tdd.template.exceptions.EmptyException;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class QueueTests {
    @Test
    public void queueIsNotEmptyAfterAddingSomeInteger() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void queueIsEmpty() {
        Queue<Integer> queue = new Queue<>();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void removeEmptyThrowsEmptyException(){
        Queue<Integer> queue = new Queue<>();
        try {
            queue.remove();
            fail();
        }catch (EmptyException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void removeOneElement() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        try {
            queue.remove();
        } catch (EmptyException e) {
            e.printStackTrace();
        }
        assertTrue(queue.isEmpty());
    }

    @Test
    public void AddTwoRemoveOneElement() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(12);
        try {
            queue.remove();
        } catch (EmptyException e) {
            e.printStackTrace();
        }
        assertFalse(queue.isEmpty());
    }

    @Test
    public void topThrowsEmptyException() {
        Queue<Integer> queue = new Queue<>();
        try {
            queue.top();
            fail();
        } catch (EmptyException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void queueStoresCorrectly() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(11);

        int topNumber = 0;
        try {
            topNumber = queue.top();
        } catch (EmptyException e) {
            e.printStackTrace();
        }

        assertTrue(topNumber == 10);
    }

    @Test
    public void queueStoresCorrectlyTwoNumbers() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(11);

        int topNumber = 0;
        try {
            queue.remove();
            topNumber = queue.top();
        } catch (EmptyException e) {
            e.printStackTrace();
        }

        assertTrue(topNumber == 11);
    }

    @Test
    public void queueGetSize() {
        Queue<Integer> queue = new Queue<>();
        queue.add(10);
        queue.add(11);

        assertTrue(queue.size() == 2);
    }
    @Test
    public void queueGetSizeWhenEmpty() {
        Queue<Integer> queue = new Queue<>();

        assertTrue(queue.size() == 0);
    }
}
