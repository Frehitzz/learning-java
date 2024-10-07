
import java.util.Stack;
public class STackprac {
    public static void main (String[]args){
        Stack<String> stack = new Stack <String>(); 
// the "stack" is the name of your stack, <String> is changeable*/

       stack.push("Apples"); // .push() = put an item to out stack
       stack.push("Banana");
       stack.push("Cake");

       String removed = stack.pop(); // remove an item to out stack
       String peeked = stack.peek(); // output the last item

       System.out.println(stack);
       System.out.println("the remove item is: "+removed);
       System.out.println("This is the peeked item: "+peeked);
    }
}
