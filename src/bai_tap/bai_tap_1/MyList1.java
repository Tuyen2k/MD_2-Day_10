package bai_tap.bai_tap_1;

import java.util.*;

public class MyList1<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList1() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList1(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int capacity) {
        int newCapacity = capacity * 2 + 1;
        elements = Arrays.copyOf(elements, newCapacity);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapacity(size);
        }
        elements[size++] = e;
    }

    public int size() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(int index, E e) {
        checkIndex(index);
        ensureCapacity(size);
        elements[size++] = elements[size];
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = e;
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public E remove(int index) {
        E e = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public boolean contains(E o) {
        boolean flag = false;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                index = i;
                break;
            }
        }
        return index;
    }

   public void clear(){
      elements = new Object[DEFAULT_CAPACITY];
      size = 0;
   }
}
