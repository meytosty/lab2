import java.util.NoSuchElementException;
public class MyArrayListQueue<T> {
    MyArrayList<T> list;
    public MyArrayListQueue() {
        this.list = new MyArrayList<>();
    }
    public void display() {
        System.out.println("Твоя очередь сейчас выглядит так:");
        for(int i = 0; i < size(); i++) { // going through the queue
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
    /**
     * isEmptyThrowException - throw exception to avoid errors
     * @noparam
     * @return void
     * @throws NoSuchElementException
     */
    private void isEmptyThrowException() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    /**
     * enqueue - adds an element to the back of the queue
     * @param item - given element to add
     * @return void
     */
    public void enqueue(T item) {
        list.add(item, 0);
    }

    /**
     * dequeue - removes and returns the front element of the queue
     * @noparam
     * @return T - element in generic type
     */
    public T dequeue() {
        return (T) list.remove(list.size()-1);
    }

    /**
     * peek - returns the front element of the queue without removing it
     * @noparam
     * @return T - element in generic type
     * @throws NoSuchElementException
     */
    public T peek() throws NoSuchElementException {
        isEmptyThrowException();
        return (T) list.get(list.size()-1);
    }

    /**
     * isEmpty - returns true if the queue is empty or false if it is not
     * @noparam
     * @return boolean
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * size - returns the number of elements in the queue
     * @noparam
     * @return int
     */
    public int size() {
        return list.size();
    }
}
