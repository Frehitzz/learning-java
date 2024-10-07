import java.util.Random; //import these to use random()
public class randomnum {
     public static void main(String[] args){
        
        Random random = new Random(); // initiate just like a scanner

        int x = random.nextInt(10)+ 1; 
        //for integer write random.nextInt() inside the parenthesis put the limit number to output 
        
        double y = random.nextDouble(10);
        // for double
        System.out.println(x); //prints out the x and y which contains our random num
        System.out.println(y);
     }
}
