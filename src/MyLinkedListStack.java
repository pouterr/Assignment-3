import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private MyLinkedList<T> list;

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(T element) {
        list.add(element);
    }

    public boolean isEmpty() {
        int size = list.size();
        if(size ==0){
            return true;
        }else{
            return false;
        }
    }
}
