import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }
    public void push(T item) {
        this.list.add(item, 0);
    }

    public T pop() {
        isEmptyThrowException();
        return (T) list.remove(0);
    }

    public T peek() {
        isEmptyThrowException();
        return (T) list.get(0);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public int size() {
        return list.size();
    }
}
