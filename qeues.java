import java.util.Queue;
import java.util.LinkedList;
public class qeues {
    public static void main(String[] args){
        //QUEUS ARE "FIFO" = first in, first out
        // the first one you add will be first remove

        // add = "enqueue" or "offer()"
        // remove = "dequeue" or "poll()"
        Queue<String> queue = new LinkedList<String>();

        /*queue.offer("David");
        queue.offer("Jhon");      // prints out david,jhon and karen
        queue.offer("Karen");
        System.out.println(queue); */


       /*   queue.offer("David");
            queue.offer("Jhon");
            queue.offer("Karen");   // output: [Jhon, Karen] = it removes david who is the first one added
            queue.poll();
            System.out.println(queue); */


            queue.offer("David");
            queue.offer("Jhon");     
            queue.offer("Karen");
            System.out.println(queue.peek());  //output: David = prints out the first added
            System.out.println(queue.isEmpty()); // check if the queue is empty
            System.out.println(queue.size()); //output: 3 = total size of the items david, jhon, and karen
            System.out.println(queue.contains( "Karen")); // check if nasa item ba natin si karen it return true or falser



    }
}
