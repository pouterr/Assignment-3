public class Test {
    public static void main(String[] args) {
        MyLinkedListQueue<Object> stack = new MyLinkedListQueue<>();
        System.out.println(stack.isEmpty());
        stack.enqueue(4);
        stack.enqueue(1);
        stack.enqueue(10);
        System.out.println(stack.size());
        System.out.println(stack.peek());
    }




}
