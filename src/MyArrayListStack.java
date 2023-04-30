import java.util.EmptyStackException;
public class MyArrayListStack extends MyArrayList {
    private MyArrayList list;

    public MyArrayListStack() {
        list = new MyArrayList<>();
    }

    public void push(Object element) {
        list.add(element);
    }

    public Object pop() {
        if (list.size() == 0) {
            throw new EmptyStackException();
        }
        return list.remove(list.size() - 1);
    }
}
