# 💜 Laborotory work 2 | Bakhtiyar Ketebay
### Algorithms and Data Structures | Khaimuldin Nursultan

## ⭐ Main.java
### ✒️ testMyArrayList()
> **Description:** This function run and test all methods of ***MyArrayList.java***.
### ✒️ testMyLinkedList()
> **Description:** This function run and test all methods of ***MyLinkedList.java***.
### ✒️ testStack()
> **Description:** This function run and test all methods of ***MyArrayListStack.java***.
### ✒️ testQueue()
> **Description:** This function run and test all methods of ***MyArrayListQueue.java***.

## ⭐ MyArrayListStack.java
### ✒️ display()
> **Description:** This function displaying all elements of stack in console.
```java
public void display() {
  System.out.println("Твой стек сейчас выглядит так:");
  for(int i = 0; i < size(); i++) {
    System.out.println(list.get(i));
  }
}
```
### ✒️ isEmptyThrowException()
> **Description:** This function throwing exception if stack is empty to avoid errors.
```java
public void isEmptyThrowException() {
  if (isEmpty()) {
    throw new EmptyStackException();
  }
}
```
### ✒️ push()
> **Description:** This function adding element to top of the stack.
```java
public void push(T item) {
  this.list.add(item, 0);
}
```
### ✒️ pop()
> **Description:** This function remove specified element and return element at the top of stack.
```java
public T pop() {
  return (T) list.remove(0);
}
```
### ✒️ peek()
> **Description:** This function returns the element at the top of the stack without removing it.
```java
public T peek() {
  isEmptyThrowException();
  return (T) list.get(0);
}
```
### ✒️ isEmpty()
> **Description:** This function returns true if the stack is empty or false if it is not.
```java
public boolean isEmpty() {
  return list.isEmpty();
}
```
### ✒️ size()
> **Description:** This function returns the number of elements in the stack.
```java
public int size() {
  return list.size();
}
```

## ⭐ MyArrayListQueue.java
### ✒️ display()
> **Description:** This function displaying all elements of queue in console.
```java
public void display() {
  System.out.println("Твоя очередь сейчас выглядит так:");
  for(int i = 0; i < size(); i++) { // going through the queue
    System.out.print(list.get(i) + " ");
  }
  System.out.println();
}
```
### ✒️ isEmptyThrowException() 
> **Description:** This function throwing exception if queue is empty to avoid errors.
```java
public void isEmptyThrowException() throws NoSuchElementException {
  if (isEmpty()) {
    throw new NoSuchElementException();
  }
}
```
### ✒️ enqueue()
> **Description:** This function adds an element to the back of the queue.
```java
public void enqueue(T item) {
  this.list.add(item, 0);
}
```
### ✒️ dequeue()
> **Description:** This function removes and returns the front element of the queue.
```java
public T pop() {
  return (T) list.remove(list.size()-1);
}
```
### ✒️ peek()
> **Description:** This function returns the front element of the queue without removing it.
```java
public T peek() throws NoSuchElementException {
  isEmptyThrowException();
  return (T) list.get(list.size()-1);
}
```
### ✒️ isEmpty()
> **Description:** This function returns true if the queue is empty or false if it is not.
```java
public boolean isEmpty() {
  return list.isEmpty();
}
```
### ✒️ size()
> **Description:** This function returns the number of elements in the queue.
```java
public int size() {
  return list.size();
}
```

## ⭐ MyArrayList.java
### ✒️ display()
> **Description:** This function displaying all elements of list in console.
```java
public void display() {
  for (int i = 0; i < size; i++) {
    System.out.print(arr[i] + "  ");
  }
  System.out.println();
}
```
### ✒️ checkIndex()
> **Description:** This function checking if given index correct, throwing error if not.
```java
public void checkIndex(int index) {
  if (index >= size || index < 0) {
    throw new IndexOutOfBoundsException();
  }
}
```
### ✒️ increaseLen()
> **Description:** This function increasing size of array if that doesn't have enough space.
```java
public void increaseLen() {
  T[] newArr = (T[]) new Object[arr.length*2];
  for(int i = 0; i < size; i++) {
    newArr[i] = arr[i];
  }
  arr = newArr;
}
```
### ✒️ isSortable()
> **Description:** This function checking is array can be sorted, return true if yes, false otherwise.
```java
public String isSortable() {
  int intSize = 0;
  int doubleSize = 0;
  for (int i = 0; i < size; i++) {
    try {
      int value = (Integer) arr[i];
      intSize++;
    } catch (ClassCastException e) {}
    try {
      double tempD = (Double) arr[i];
      doubleSize++;
    } catch (ClassCastException e) {}
  }
  if (intSize == size) {
    return "int";
  }
  if (doubleSize == size) {
    return "double";
  }
  return "0";
}
```
### ✒️ size()
> **Description:** This function returning size of array as integer.
```java
@Override
public int size() {
  return size;
}
```
### ✒️ contains(Object o)
> **Description:** This function returning true if array contains given object, false otherwise.
```java
@Override
public boolean contains(Object o) {
  for(int i = 0; i < size; i++) {
    if(arr[i] == o) {
      return true;
    }
  }
  return false;
}
```
### ✒️ add(Object item)
> **Description:** This function adding a new element to array.
```java
@Override
public void add(Object item) {
  if(size == arr.length) {
    increaseLen();
  }
  arr[size++] = (T) item;
}
```
### ✒️ add(Object item, int index)
> **Description:** This function adding a new element to specific index in array.
```java
@Override
public void add(Object item, int index) {
  checkIndex(index);
  if(size == arr.length){
    increaseLen();
  }
  T[] newArr = (T[]) new Object[arr.length];
  for (int i = 0; i < index; i++) {
    newArr[i] = arr[i];
  }
  for (int i = index; i < size; i++) {
    newArr[i+1] = arr[i];
  }
  newArr[index] = (T) item;
  arr = newArr;
  size++;
}
```
### ✒️ remove(Object item)
> **Description:** This function removing item from array and return true if item has removed, false otherwise.
```java
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
```
### ✒️ remove(int index)
> **Description:** This function removing item from array in specific index and return item which was removed.
```java
@Override
public Object remove(int index) {
  checkIndex(index);
  T imposter = arr[index];
  for(int i = index + 1; i < size; i++){
    arr[i-1] = arr[i];
  }
  size--;
  return imposter;
}
```
### ✒️ clear()
> **Description:** This function clearing array by creating new empty array.
```java
@Override
public void clear() {
  this.arr = (T[]) new Object[5];
  this.size = 0;
}
```
### ✒️ get(int index)
> **Description:** This function returning element from array in specific index.
```java
@Override
public Object get(int index) {
  checkIndex(index);
  return arr[index];
}
```
### ✒️ indexOf(Object o)
> **Description:** This function returning first index of given element, -1 if element doesn't exist in array.
```java
@Override
public int indexOf(Object o) {
  for(int i = 0; i < size; i++){
    if(arr[i] == o){
      return i;
    }
  }
  return -1;
}
```
### ✒️ lastIndexOf(Object o)
> **Description:** This function returning last index of given element, -1 if element doesn't exist in array.
```java
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
```
### ✒️ sort()
> **Description:** This function sorting array with bubble sort.
```java
@Override
public void sort() {
  if (isSortable().equals("int")) {
    int n = size;
    for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
        if ((int) arr[j] > (int) arr[j+1]) {
          T temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
  }
  if (isSortable().equals("double")) {
    int n = size;
    for (int i = 0; i < n-1; i++)
      for (int j = 0; j < n-i-1; j++)
        if ((Double) arr[j] > (Double) arr[j+1]) {
          T temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
  }
}
```
## ⭐ MyLinkedList.java
### ✒️ display()
> **Description:** This function displaying all elements of list in console.
```java
public void display() {
  if (size == 0) {
    System.out.print("empty\n");
    return;
  }
  if (head.next == null) {
    System.out.println(head.val);
    return;
  }
  System.out.print(head.val + " - ");
  Node<T> ptr = head.next;
  while (ptr.next != null) {
    System.out.print(ptr.val + " - ");
    ptr = ptr.next;
  }
  System.out.print(ptr.val + "\n");
}
```
### ✒️ checkIndex()
> **Description:** This function checking if given index correct, throwing error if not.
```java
public void checkIndex(int index) {
  if (index >= size || index < 0) {
    throw new IndexOutOfBoundsException();
  }
}
```
### ✒️ isSortable()
> **Description:** This function checking is list can be sorted, return true if yes, false otherwise.
```java
public boolean isSortable() {
  Node<T> ptr = head;
  int intSize = 0;
  int doubleSize = 0;
  for (int i = 1; i <= size; i++) {
    try {
      int value = (Integer) ptr.val ;
      intSize++;
    } catch (ClassCastException e) {}
    try {
      double tempD = (Double) ptr.val;
      doubleSize++;
    } catch (ClassCastException e) {}
    ptr = ptr.next;
  }
  if (intSize == size || doubleSize == size || doubleSize + intSize == size) {
    return true;
  }
  return false;
}
```
### ✒️ size()
> **Description:** This function returning size of list as integer.
```java
@Override
public int size() {
  return size;
}
```
### ✒️ contains(Object o)
> **Description:** This function returning true if list contains given object, false otherwise.
```java
@Override
public boolean contains(Object o) {
  if (head.val == o) {
    return true;
  }
  Node<T> ptr = head.next;
  while (ptr != null) {
    if (ptr.val == o) {
      return true;
    }
    ptr = ptr.next;
  }
  return false;
}
```
### ✒️ add(Object item)
> **Description:** This function adding a new element to list.
```java
@Override
public void add(Object item) {
  Node<T> newNode = new Node<T>((T) item, null, null);
  if (head == null) {
    head = newNode;
    tail = head;
  }
  else {
    newNode.prev = tail;
    tail.next = newNode;
    tail = newNode;
  }
  size++;
}
```
### ✒️ add(Object item, int index)
> **Description:** This function adding a new element to specific index in list.
```java
@Override
public void add(Object item, int index) {
  checkIndex(index);
  Node<T> newNode = new Node<T>((T) item, null, null);
  if (index == 0) {
    add(item);
    return;
  }
  Node<T> ptr = head;
  for (int i = 1; i <= size; i++) {
    if (i == index) {
      Node<T> temp = ptr.next;
      ptr.next = newNode;
      newNode.prev = ptr;
      newNode.next = temp;
      temp.prev = newNode;
    }
    ptr = ptr.next;
  }
  size++;
}
```
### ✒️ remove(Object item)
> **Description:** This function removing item from list and return true if item has removed, false otherwise.
```java
@Override
public boolean remove(Object item) {
  Node<T> newNode = new Node<T>((T) item, null, null);
  if (head.val == newNode.val) {
    head = head.next;
    head.prev = null;
    size--;
    return true;
  }
  Node<T> ptr = head.next;
  while (ptr != null) {
    if (ptr.val == newNode.val) {
      Node<T> temp = ptr.prev;
      temp.next = ptr.next;
      Node<T> temp2 = ptr.next;
      temp2.prev = temp;
      size--;
      return true;
    }
    ptr = ptr.next;
  }
  return false;
}
```
### ✒️ remove(int index)
> **Description:** This function removing item from list in specific index and return item which was removed.
```java
@Override
public Object remove(int index) {
  checkIndex(index);
  if (index == 0) {
    Object removed = head.val;
    if (size == 1) {
      head = null;
      tail = null;
      size = 0;
      return removed;
    }
    head = head.next;
    head.prev = null;
    size--;
    return removed;
  }
  if (index == size-1) {
    Object removed = tail.val;
    tail = tail.prev;
    tail.next = null;
    size--;
    return removed;
  }
  Node<T> ptr = head.next;
  for (int i = 1; i <= size; i++) {
    if (index == i) {
      Node<T> p = ptr.prev;
      Node<T> n = ptr.next;
      Object removed = ptr.val;

      p.next = n;
      n.prev = p;
      size--;
      return removed;
    }
    ptr = ptr.next;
  }
  return null;
}
```
### ✒️ clear()
> **Description:** This function clearing list by creating new empty list.
```java
@Override
public void clear() {
  this.head = null;
  this.tail = null;
  size = 0;
}
```
### ✒️ get(int index)
> **Description:** This function returning element from list in specific index.
```java
@Override
public Object get(int index) {
  checkIndex(index);
  if (index == 0) {
    return head.val;
  }
  Node<T> newNode = head.next;
  for (int i = 1; i <= size; i++) {
    if (i == index) {
      return newNode.val;
    }
    newNode = newNode.next;
  }
  return null;
}
```
### ✒️ indexOf(Object o)
> **Description:** This function returning first index of given element, -1 if element doesn't exist in list.
```java
@Override
public int indexOf(Object o) {
  Node<T> newNode = new Node<T>((T) o, null, null);
  if (head.val == newNode.val) {
    return 0;
  }
  Node<T> ptr = head.next;
  for (int i = 1; i <= size; i++) {
    if (ptr.val == newNode.val) {
      return i;
    }
    ptr = ptr.next;
  }
  return -1;
}
```
### ✒️ lastIndexOf(Object o)
> **Description:** This function returning last index of given element, -1 if element doesn't exist in list.
```java
@Override
public int lastIndexOf(Object o) {
  Node<T> newNode = new Node<T>((T) o, null, null);
  if (tail.val == newNode.val) {
    return size-1;
  }
  Node<T> ptr = tail.prev;
  for (int i = size-2; i >= 0; i--) {
    if (ptr.val == newNode.val) {
      return i;
    }
    ptr = ptr.prev;
  }
  return -1;
}
```
### ✒️ sort()
> **Description:** This function sorting list with bubble sort.
```java
@Override
public void sort() {
  if (isSortable()) {
    Node<T> front = head;
    Node<T> back = null;
    while (front != null) {
      back = front.next;
      while (back != null && back.prev != null && (Integer) back.val < (Integer) back.prev.val) {
        swapValue(back, back.prev);
        back = back.prev;
      }
      front = front.next;
    }
  }
}
```
