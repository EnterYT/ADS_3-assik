import java.util.NoSuchElementException;
public class MyLinkedListQueue<T> extends MyLinkedList {
    private MyLinkedList<T> list;

    MyLinkedListQueue() {
        list = new MyLinkedList<>();
    }

    public void enqueue(T element) {
        list.add(element);
    }
}
