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
