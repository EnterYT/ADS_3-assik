import java.util.EmptyStackException;

public class MyLinkedListStack<T> extends MyLinkedList {
    private MyLinkedList<T> list;

    public MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    public int size() {
        return list.size();
    }
}
