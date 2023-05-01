import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }
    public void enqueue(T item) {
        list.add(item, 0);
    }
    public T dequeue() {
        return (T) list.remove(list.size()-1);
    }
    public T peek() {
        return (T) list.get(list.size()-1);
    }
}
