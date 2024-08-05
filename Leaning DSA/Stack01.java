import java.util.*;
class Stack01{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        System.out.println(st.peek());
        System.out.println(st.pop());
    }
}