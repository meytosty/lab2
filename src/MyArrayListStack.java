import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T item) {
        this.list.add(item, 0);
    }
}
