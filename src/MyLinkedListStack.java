import java.util.EmptyStackException;

public class MyLinkedListStack<T> extends MyLinkedList {
    private MyLinkedList<T> list;

    MyLinkedListStack() {
        list = new MyLinkedList<>();
    }

    /**
     * push() - method that adds an element to the top of the stack.
     * @param element
     */
    public void push(T element) {
        list.add(element, 0);
    }

    /**
     * pop() - method that removes and returns the top element of the stack.
     * @return
     */
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) list.remove(0);
    }

    /**
     * peek() - method that returns the top element of the stack without removing.
     * @return
     */
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return (T) list.get(0);
    }

    /**
     * isEmpty() - method that returns true if the stack is empty or false if it is not.
     * @return
     */
    public boolean isEmpty() {
        return list.size() == 0;
    }

    /**
     * size() - method that returns the number of elements in the stack.
     * @return
     */
    public int size() {
        return list.size();
    }
}
