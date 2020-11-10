package Problem1;

public class ValidParentheses {

    // Do not change signature (function name, parameters, return type)
    public static boolean isValid(String str) {
        if(str == null || str.length() == 0){
            return true;
        }

        Stack<Character> s = new LinkedListStack<>();

        for(int i = 0; i < str.length(); i++){
            char re = str.charAt(i);
            Character in = s.peek();
            if (in == null || !characterMatch(in,re)){
                s.push(re);
                continue;
            }
            s.pop();
        }
        return s.size() == 0;
    }

    private static boolean characterMatch(char left, char right){
        switch(left){
            case '(':
                return right == ')';
            case '{':
                return right == '}';
            case '[':
                return right == ']';
        }
        return false;
    }
}
