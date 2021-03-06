package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _02_05_SumListReverseTest {

    private _02_05_SumListReverse s = new _02_05_SumListReverse();

    @Test
    public void withTwoEmptyLists() {
        assertEquals(LinkedListNode.empty(), s.sum(LinkedListNode.empty(), LinkedListNode.empty()));
    }

    @Test
    public void withOneEmptyList() {
        assertEquals(LinkedListNode.of(1, 2, 3), s.sum(LinkedListNode.empty(), LinkedListNode.of(1, 2, 3)));
    }

    @Test
    public void withNoCarry() {
        assertEquals(LinkedListNode.of(2, 4, 6), s.sum(LinkedListNode.of(1, 2, 3), LinkedListNode.of(1, 2, 3)));
    }

    @Test
    public void withCarry() {
        assertEquals(LinkedListNode.of(0, 4, 6), s.sum(LinkedListNode.of(1, 8, 3), LinkedListNode.of(9, 5, 2)));
    }

    @Test
    public void withCarryAtEnd() {
        assertEquals(LinkedListNode.of(0, 4, 2, 1), s.sum(LinkedListNode.of(1, 8, 9), LinkedListNode.of(9, 5, 2)));
    }
}