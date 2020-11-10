package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    private ArrayStack() {
    }

    public ArrayStack(int capacity) {
        // homework
        if(capacity > 0){
            data = (T[]) new Object[capacity];
        }
        size = 0;
    }

    @Override
    public boolean push(T val) {
        // homework
        if(size == data.length){
            return false;
        }
        data[size] = val;
        size++;
        return true;
    }

    @Override
    public T pop() {
        // homework
        if(size == 0){
            return null;
        }
        T val = data[size - 1];
        size--;
        return val;   // place holder
    }

    @Override
    public T peek() {
        if(size == 0){
            return null;
        }
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }
}
