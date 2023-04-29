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

    /**
     * Removes and returns the front element of the queue.
     *
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        T peek = list.get(0);
        list.remove(0);
        return peek;
    }

    /**
     * Returns true if the queue is empty, false otherwise.
     *
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        int size = list.size();
        if(size ==0){
            return true;
        }else{
            return false;
        }
    }
}
