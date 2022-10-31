package ANUJ_BHAIYYA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class infix_to_postfix {

    static int precedence( Character ch )
    {
       switch (ch)
       {
           case '+':
           case '-':
                return 1;
           case '*':
           case '/':
               return 2;
           case '^':
               return 3;
       }
       return -1;
    }
    static String infixToPostfix( String str)
    {
        Stack<Character> st = new Stack<>();
        String ans = new String("");
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if( ch=='('){
                st.push(ch);
            }
            else if( ch==')')
            {
                while ( !st.isEmpty() && st.peek()!='(')
                {
                    ans = ans + st.pop();
                }
                st.pop();
            }
            else if( Character.isLetterOrDigit(ch))
            {
                ans = ans + ch;
            }
            else {
                while ( !st.isEmpty() && precedence(ch) <= precedence( st.peek()))
                {
                    ans = ans + st.pop();
                }
                st.push(ch);
            }

        }
        while ( !st.isEmpty() )
        {
            if( st.peek()=='(') return "INVALID EXPRESSION";
            ans = ans + st.pop();
        }
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println( infixToPostfix(str) );

    }
}
