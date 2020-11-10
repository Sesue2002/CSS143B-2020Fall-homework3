package Problem1;

import java.util.LinkedList;

public class LinkedListStack<T> implements Stack<T> {
    // use Java LinkedList to store the data
    // do not change member variables
    private LinkedList<T> data;

    //what i tried to do here was create a link list with a stack but i couldnt get the idea
    //of how to make linked list stack

    //dude data is a linked list so just make a new one lol
    public LinkedListStack() {
        // homework
        data = new LinkedList<T>();
    }

    //since its a linked list if you push, it adds it to the beginning
    @Override
    public boolean push(T val) {
        // homework
        data.addFirst(val);
        return true;
    }

    @Override
    public T pop() {
        // homework
        return data.pop();
    }

    //so if the size is 0 there is nothing to see
    //but if there is then you use the get function to see anywhere, we want to see the front so set it to the first index
    //which is 0
    @Override
    public T peek() {
        // homework
        if(data.size() == 0){
            return null;
        }
        return data.get(0);
    }

    @Override
    public int size() {
        return data.size();
    }
}

