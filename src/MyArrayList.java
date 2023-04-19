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
    public void increaseLen(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    public String isSortable() {
        int intSize = 0;
        int doubleSize = 0;
        for (int i = 0; i < size; i++) {
            try {
                int value = (Integer) arr[i];
                intSize++;
            } catch (ClassCastException e) {
            }
            try {
                double tempD = (Double) arr[i];
                doubleSize++;
            } catch (ClassCastException e) {
            }
        }
        if (intSize == size) {
            return "int";
        }
        if (doubleSize == size) {
            return "double";
        }
        return "0";
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
        if(size == arr.length){
            increaseLen();
        }
        arr[size+1] = (T) item;
    }

    @Override
    public void add(Object item, int index) {
        checkIndex(index);
        if(size == arr.length){
            increaseLen();
        }
        for(int i = index + 1; i < size; i++){
            arr[i - 1] = arr[i];
        }
        arr[index] = (T) item;
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
        for(int i = 0; i < size; i++){
            if(arr[i] == o){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int last = -1;
        for(int i = 0; i < size; i++){
            if(arr[i] == o){
                last = i;
            }
        }
        return last;
    }

    @Override
    public void sort() {
        if (isSortable().equals("int")) {
            int n = size;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if ((int) arr[j] > (int) arr[j+1])
                    {
                        T temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
        if (isSortable().equals("double")) {
            int n = size;
            for (int i = 0; i < n-1; i++)
                for (int j = 0; j < n-i-1; j++)
                    if ((Double) arr[j] > (Double) arr[j+1])
                    {
                        T temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
        }
    }
}
