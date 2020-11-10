package Problem1;

public class MinStack extends ArrayStack<Integer> {

    //wow a stack
    private Stack<Integer> aStack;

    public MinStack(int size) {
        //already did stack so we can super it!
        super(size);
        //we create a new aS with same size
        aStack = new ArrayStack<>(size);
    }

    @Override
    public boolean push(Integer val) {
        //uses an integer variable to see the first val
        Integer first = aStack.peek();
        //check if there is anything, then see if the val is bigger than the first
        if(first == null || val < first){
            //add val to the new aS
            aStack.push(val);
        }
        //if it aint bigger or nothing we push it to super aS
        return super.push(val);
    }

    @Override
    public Integer pop() {
        // homework
        //another see if its smaller or the same val
        Integer aI = aStack.peek();
        Integer a = super.peek();
        if(a != null && a.intValue() == aI.intValue()){
            aStack.pop();
        }
        return super.pop();
    }

    //the new stack has all the small vals for each list we insert
    public Integer getMin() {
        return aStack.peek();
    }
}

