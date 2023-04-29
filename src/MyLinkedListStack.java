import java.util.EmptyStackException;

public class MyLinkedListStack<T> {

    private MyLinkedList<T> list;

    /**
     * Constructs an empty stack.
     */
    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to be added to the top of the stack
     */
    public void push(T element) {
        list.add(element);
    }

    /**
     * Removes and returns the top element of the stack.
     *
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T last_element = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return last_element;
    }

    /**
     * Returns the top element of the stack without removing it.
     *
     * @return the top element of the stack
     * @throws EmptyStackException if the stack is empty
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size()-1);
    }

    public boolean isEmpty() {
        int size = list.size();
        if(size ==0){
            return true;
        }else{
            return false;
        }
    }

    public int size() {
        return list.size();
    }
}
