import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuesExamples {

     void queuesMethod(){
        System.out.println("\n"+"----- Queues Examples-----");

       Queue<String> queue = new ArrayDeque<>();
      //  Queue<String> queue = new LinkedList<>();
      //  Queue<String> queue = new PriorityQueue<>();
        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);

        System.out.println(queue.peek());


        queue.poll();
        System.out.println(queue);
    }
}
