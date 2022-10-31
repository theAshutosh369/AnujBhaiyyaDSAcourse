package ANUJ_BHAIYYA.Stack;

import java.util.Scanner;
import java.util.Stack;

public class evaluate_prefix {
    static int evaluatePrefix(String str )
    {
        Stack<Integer> st = new Stack<>();

        for (int i = str.length()-1; i>=0 ; i--)
        {
            char ch = str.charAt(i);
            if( Character.isLetterOrDigit(ch ) )
            {
                st.push(ch-'0');
            }
            else {
                int so = st.pop();
                int fo = st.pop();

                switch (ch)
                {
                    case '+':
                        st.push(fo+so);
                        break;
                    case '-':
                        st.push(fo-so);
                        break;
                    case '*':
                        st.push(fo*so);
                        break;
                    case '/':
                        st.push(fo/so);
                        break;
                }

            }
        }
        return st.pop();
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println( evaluatePrefix(str) );
    }

}
