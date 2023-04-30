public class Main {
    public static void main(String[] args) {
        MyArrayListStack myArrayListStack = new MyArrayListStack();
        System.out.println(myArrayListStack.size());
        System.out.println(myArrayListStack.isEmpty());
        myArrayListStack.push(1);
        myArrayListStack.push(2);
        System.out.println(myArrayListStack.size());
        System.out.println(myArrayListStack.isEmpty());
        System.out.println(myArrayListStack.peek());
    }
}