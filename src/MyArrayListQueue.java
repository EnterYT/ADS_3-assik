import java.util.NoSuchElementException;
public class MyArrayListQueue extends MyArrayList{
    private MyArrayList list;

    MyArrayListQueue() {
        list = new MyArrayList<>();
    }

    public void enqueue(Object element) {
        list.add(element);
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public int size() {
        return list.size();
    }
}
