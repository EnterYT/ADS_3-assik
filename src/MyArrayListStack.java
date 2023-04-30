import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList list;

    MyArrayListStack() {
        list = new MyArrayList<>();
    }

    public void push(Object element) {
        list.add(element);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.remove(0);
    }

    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(0);
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
