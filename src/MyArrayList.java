public class MyArrayList<T> implements MyList{
    private T[] arr;
    private int size;
    public MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    public void checkIndex(int index){
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size; i++){
            if(arr[i] == o){
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(Object item) {

    }

    @Override
    public void add(Object item, int index) {

    }

    @Override
    public boolean remove(Object item) {
        for(int i = 0; i < size; i++){
            if(arr[i] == item){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        T imposter = arr[index];
        for(int i = index + 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        return imposter;
    }

    @Override
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public void sort() {

    }
}
