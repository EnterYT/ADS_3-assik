import java.util.EmptyStackException;

public class MyLinkedListStack<T> extends MyLinkedList {
    private MyLinkedList<T> list;

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public void push(T element) {
        list.add(element, 0);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) list.remove(0);
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return list.size();
    }
}
