package Problem1;

public class ArrayStack<T> implements Stack<T> {
    // do not change member variables
    private T[] data;
    private int size;

    //Anything that had to do with stack i barely understood
    //my b.
    //ill just write out what i thought shouldve been done but couldnt do it
    //this was actually the only one i did right
    //this is my fault, i tried looking for help online to see how certain codes were written
    //but the whole concept of list took my whole week trying to understand and i still dont understand
    //understanding meaning i didnt know how to code with them
    //using list made my brain hurt because i didnt understand the nodes nor did i understand the dummy node
    //i think the main thing that tripped me up was the foundation of list
    //i understood what it meant to be a list but didnt understand how it was used in code or how create certain
    //parts and assign them to the list like in the linked list and single linked list
    //this being what made all my time go to waste
    //ill talk to kevin tomorrow to understand linked list and how to implement it in different ways
    //this is probably the first and only time ill do this
    //ill contact you when we get the next homework so i can ask questions and understand everything about
    //i was just stressed with understanding the concept more than the homework
    //thanks tho for trying to teach it to me, sorry i couldnt reflect it however.

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
        T val = data[size - 1];
        data[size - 1] = null;
        size--;
        return val;   // place holder
    }

    @Override
    public T peek() {
        return data[size - 1];
    }

    @Override
    public int size() {
        return size;
    }
}
