import java.util.NoSuchElementException;
public class MyArrayListQueue<T> extends MyArrayList{
    private MyArrayList<T> list;

    MyArrayListQueue() {
        list = new MyArrayList<>();
    }

    public void enqueue(T element) {
        list.add(element);
    }
}
