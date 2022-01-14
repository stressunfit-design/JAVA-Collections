import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.offer(12);
        queue.offer(24);
        queue.offer(36);
        // You can use peek method to see the first added element
        System.out.println(queue.peek());
        
    }
}
