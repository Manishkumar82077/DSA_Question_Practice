import java.util.LinkedList;
import java.util.Queue;

class Queue01{
    public static void main(String[] args) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(25);
        qu.add(26);
        qu.add(27);
        qu.add(28);
        qu.add(29);
        qu.add(30);
        qu.add(31);
        System.out.println(qu.peek());
    }
}