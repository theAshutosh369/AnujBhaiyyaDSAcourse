package ANUJ_BHAIYYA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class parenthesis_matching {
    static Scanner s = new Scanner(System.in);

    static boolean isMatching( char a , char b )
    {
        return ( ( a=='(' && b==')') || (a=='{' && b=='}') || (a=='[' && b==']') );
    }
    static boolean code()
    {
        String str = s.next();
        Stack<Character> st = new Stack<>();
        for (int j = 0; j < str.length(); j++)
        {
            char ch = str.charAt(j);
            if( ch=='(' || ch=='{' || ch=='[')
            {
                st.add(ch);
            }
            else {
                if( st.isEmpty() ) return false;
                else if( !isMatching( st.peek() , ch ))
                {
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        int t = s.nextInt();
        for (int i = 0; i < t; i++)
        {
            System.out.println( code() );
        }
    }
}
