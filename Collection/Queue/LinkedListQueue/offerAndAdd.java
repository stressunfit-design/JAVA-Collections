import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        
        // Offer method can be used to add elements into linkedlistQueue

        queue.offer(12);
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);
        
        
       // You can also use add method to add elements into linkedlistQueue but it returns expection when the operation is not successful.
       
       queue.add(13);
       queue.add(16);
       
       System.out.println(queue);

    }
}
