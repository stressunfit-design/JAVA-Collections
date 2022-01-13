import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();


        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);
        
        //  You can use poll() method to remove first added value.
        
        queue.poll();
        
        System.out.println(queue);
        
        //  You can also use remove() method but it returns an expection if the queue is empty.
        
        queue.remove();
        System.out.println(queue);

    }
}
