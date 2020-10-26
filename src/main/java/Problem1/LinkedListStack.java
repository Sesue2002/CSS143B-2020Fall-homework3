package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    //what i tried to do here was create a link list with a stack but i couldnt get the idea
    //of how to make linked list stack
    public LinkedListStack() {
        // homework
        LinkedList<T> data = new LinkedList<T>();
    }

    @Override
    public boolean push(T val) {
        // homework
        if(data.size() == 0){
            return false;
        }
        data.addLast(val);
        return true;
    }

    @Override
    public T pop() {
        // homework
        T val = peek();
        if (val == null) {
            return null;
        } else {
            data.removeLast();
            return val;
        }
    }

    @Override
    public T peek() {
        // homework
        if (data.getLast() == null) {
            return null;
        } else {
            return data.getLast();
        }
    }

    @Override
    public int size() {
        return data.size();
    }
}

