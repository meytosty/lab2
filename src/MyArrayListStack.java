import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }

    public void push(T item) {
        this.list.add(item, 0);
    }

    public T pop() {
        return (T) list.remove(0);
    }

    public T peek() {
        return (T) list.get(0);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
