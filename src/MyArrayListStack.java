import java.util.EmptyStackException;
public class MyArrayListStack<T> {
    MyArrayList<T> list;
    public MyArrayListStack() {
        this.list = new MyArrayList<>();
    }
    public void display() {
        System.out.println("Your stack right now like this:");
        for(int i = 0; i < size(); i++) { // going through the stack
            System.out.println(list.get(i));
        }
    }
    /**
     * isEmptyThrowException - throwing exception if stack is empty to avoid errors
     * @noparam
     * @return void
     */
    private void isEmptyThrowException() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
    }

    /**
     * push - adding element to top of the stack
     * @param item - given element to add
     * @return void
     */
    public void push(T item) {
        this.list.add(item, 0);
    }

    /**
     * pop - remove specified element and return element at the top of stack
     * @noparam
     * @return T - element in generic type
     */
    public T pop() {
        isEmptyThrowException();
        return (T) list.remove(0);
    }

    /**
     * peek - returns the element at the top of the stack without removing it
     * @noparam
     * @return T - element in generic type
     */
    public T peek() {
        isEmptyThrowException();
        return (T) list.get(0);
    }

    /**
     * isEmpty - returns true if the stack is empty or false if it is not
     * @noparam
     * @return boolean
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * size - returns the number of elements in the stack
     * @noparam
     * @return int
     */
    public int size() {
        return list.size();
    }
}
