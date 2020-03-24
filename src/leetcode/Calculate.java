package leetcode;

import java.util.Stack;

public class Calculate {

    public static void main(String[] args) {
        Calculate c = new Calculate();
        System.out.println(c.calculate("2147483647"));
        System.out.println(Integer.MAX_VALUE);

    }
    public int calculate(String s) {
        if(s == null || s.length() == 0)
            return 0;

        Stack<Integer> stk = new Stack<>();

        stk.push(1);  // assume there this a `()` outside the string
        int ret = 0, sign = 1, i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == ' ') {
                i++;
                continue;
            }
            if (c == '+') {
                sign = 1; i++;
            } else if (c == '-') {
                sign = -1; i++;
            } else if (c == '(') {
                stk.push(sign * stk.peek()); i++;
                sign = 1;  // remember to reset the sign
            } else if (c == ')') {
                stk.pop(); i++;
            } else {
                int num = 0;

                while (i < s.length() && Character.isDigit(c)) {
                    num = num * 10 + (c - '0');
                    i++;
                }
                ret += sign * num * stk.peek();
            }
        }

        return ret;
    }
}
