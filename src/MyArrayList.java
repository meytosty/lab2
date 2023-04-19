public class MyArrayList<T> implements MyList{
    private T[] arr;
    private int size;
    /**
     * @function constructor
     * @noparam
     * @return void
     **/
    public MyArrayList(){
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }

    /**
     * @function checkIndex of massive
     * @param index of massive
     * @return void
     **/
    public void checkIndex(int index){
        if (index >= size || index < 0){ // checks is index out of range or not
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * @function increaseLen increases the lenght of the massive
     * @noparams
     * @return void
     */
    public void increaseLen(){
        T[] newArr = (T[]) new Object[arr.length*2];
        for(int i = 0; i < size; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
    /**
     * @function isSortable checks if massive can be sorted or not
     * @noparams
     * @return String
     */
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
    /**
     * @function size give the size of the massive
     * @noparams
     * @return int
     */
    @Override
    public int size() {
        return size;
    }
    /**
     * @function contains return true if Object o in the massive
     * @param o object to search
     * @return boolean
     * **/
    @Override
    public boolean contains(Object o) {
        for(int i = 0; i < size; i++){
            if(arr[i] == o){
                return true;
            }
        }
        return false;
    }
    /**
     * @function add adds object to the massive
     * @param item object to add
     * @return void
     * **/
    @Override
    public void add(Object item) {
        if(size == arr.length){
            increaseLen();
        }
        arr[size+1] = (T) item;
    }
    /**
     * @function add object to specific index
     * @param item object to add
     * @param index index where to add the object
     * @return void
     * **/
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
    /**
     * @function remove delete object from massive
     * @param item object to delete
     * @return boolean
     * **/
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
    /**
     * @function remove delete object from massive
     * @param index index of object
     * @return Object
     * **/
    @Override
    public Object remove(int index) {
        checkIndex(index);
        T imposter = arr[index];
        for(int i = index + 1; i < size; i++){
            arr[i-1] = arr[i];
        }
        return imposter;
    }
    /**
     * @function clear delete the entire massive
     * @noparam
     * @return void
     * **/
    @Override
    public void clear() {
        this.arr = (T[]) new Object[5];
        this.size = 0;
    }
    /**
     * @function get prints the object in the specific index
     * @param index index of object
     * @return Object
     * **/
    @Override
    public Object get(int index) {
        checkIndex(index);
        return arr[index];
    }
    /**
     * @function indexOf returns the first index of object
     * @param o object to search
     * @return int
     * **/
    @Override
    public int indexOf(Object o) {
        for(int i = 0; i < size; i++){
            if(arr[i] == o){
                return i;
            }
        }
        return -1;
    }
    /**
     * @function lastIndexOf returns the last index of object
     * @param o object to search
     * @return int
     * **/
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
    /**
     * @function sort bubble sort
     * @noparam
     * @return void
     * **/
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
