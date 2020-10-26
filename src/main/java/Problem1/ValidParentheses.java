package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        // homework
        //this is what i thought would make sense
        //but since its an array i thought to use the elements but i didn't know how to implement them
        Stack<Character> arSt = new ArrayStack<>(str.length());

        for(int i = 0; i < str.length(); i++){
            char cP = str.charAt(0);
            if (cP == '{' || cP == '(' || cP == '[') {
                arSt.push(cP);
            }
            if (cP == '}' || cP == ')' || cP == ']') {

                if(arSt.peek(i) != '}' || cP == ')' || cP == ']'){
                    return false;
                }
                char last = arSt.peek();
                if(cP == '}' || cP == ')' || cP == ']'){
                    arSt.pop();
                }
                else return false;
            }

        }
        return false; // place holder
    }
}
