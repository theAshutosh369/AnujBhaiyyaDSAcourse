package ANUJ_BHAIYYA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class infix_to_prefix {

    static int precedence( Character ch )
    {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    static String replace_paranthesis( char[] s)
    {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '('){
                s[i] = ')';
                i++;
            }
            else if (s[i] == ')'){
                s[i] = '(';
                i++;
            }
        }
        return String.valueOf(s);
    }

    static StringBuilder infix_to_postfix( String str)
    {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        str = replace_paranthesis(str.toCharArray());
        str='('+str+')';

        for (int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);

            if( ch=='(' ) st.push(ch);
            else if( ch==')')
            {
                while (!st.isEmpty() && st.peek()!='(')
                {
                    res.append( st.pop());
                }
                st.pop();
            }
            else if( Character.isLetterOrDigit(ch))
            {
                res.append(ch);
            }
            else {
                while ( !st.isEmpty() && ( precedence(ch)<precedence(st.peek()) || ( precedence(ch)<=precedence(st.peek()) && ch=='^') ))
                {
                    res.append(st.pop());
                }
                st.push(ch);
            }
        }
        while ( !st.isEmpty())
        {
            res.append(st.pop());
        }
        return res;
    }
    static StringBuilder infixToPrefix( String  str )
    {
        StringBuilder s = new StringBuilder(str);
        StringBuilder rev = s.reverse();
        StringBuilder postfix = infix_to_postfix( rev.toString());

        return postfix.reverse();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println( infixToPrefix(str) );
    }
}
