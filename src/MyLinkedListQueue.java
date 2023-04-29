import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;

    /**
     * Constructs an empty queue.
     */
    public MyLinkedListQueue() {
        list = new MyLinkedList<>();
    }
}
