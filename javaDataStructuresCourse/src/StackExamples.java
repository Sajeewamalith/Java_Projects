import java.util.ArrayDeque;
import java.util.Deque;

public class StackExamples {

    static void stackMethod(){
        System.out.println("\n"+"-----Stack Examples-----");

        // have different ways
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);

        System.out.println(stack.peek());

      //  stack.pop();
      //  System.out.println(stack);

        stack.poll();
        System.out.println(stack);



    }
}
