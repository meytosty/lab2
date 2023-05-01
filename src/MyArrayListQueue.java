import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }
    public void enqueue(T item) {
        list.add(item);
    }
}
