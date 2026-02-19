package lesson_10;

import java.util.Arrays;

public class MyArray implements IMyArray {
    private static final int INITIAL_SIZE = 16;
    private Object[] array;
    private int size = 0;

    public MyArray(int initialSize) {
        if (initialSize <= 0)
            array = new Object[INITIAL_SIZE];
        else
            array = new Object[initialSize];
    }

    public MyArray() {
        this(INITIAL_SIZE);
    }

    @Override
    public boolean add(Object obj) {
        if (obj == null)
            return false;
        if (size == array.length)
            allocateArray();
        array[size++] = obj;
        //size++;
        return true;
    }

    private void allocateArray() {
        array = Arrays.copyOf(array,
                array.length * 2);
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size)
            return null;
        return array[index];
    }

    @Override
    public boolean add(int index, Object obj) {
        if (obj == null || index < 0 || index > size)
            return false;
        if (index == size)
            return add(obj);
        if (size == array.length)
            allocateArray();
        System.arraycopy(array, index, array,
                index + 1, size - index);
        array[index] = obj;
        size++;
        return true;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        return false;
    }

    @Override
    public int indexOf(Object obj) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object obj) {
        return 0;
    }

    @Override
    public boolean contains(Object obj) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }
}
