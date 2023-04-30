import java.util.NoSuchElementException;

public class MyArrayListQueue<T> {

    private MyArrayList<T> list;

    /**
     * Constructs an empty queue.
     */
    public MyArrayListQueue() {
        list = new MyArrayList<>();
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
        T first = list.get(0);
        list.remove(0);
        return first;
    }

    /**
     * Returns the front element of the queue without removing it.
     *
     * @return the front element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.get(0);
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

    /**
     * Returns the number of elements in the queue.
     *
     * @return the number of elements in the queue
     */
    public int size() {
        return list.size();
    }
}

