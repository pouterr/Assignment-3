import java.util.NoSuchElementException;

public class MyLinkedListQueue<T> {
    private MyLinkedList<T> list;

    /**
     * Constructs an empty queue.
     */
    public MyLinkedListQueue() {
        list = new MyLinkedList<>();
    }

    /**
     * Adds an element to the back of the queue.
     *
     * @param element the element to be added to the back of the queue
     */
    public void enqueue(T element) {
        list.add(element);
    }
}
