public class ifstatement {
     public static void main(String[] args) {
        
        int age = 70;

        if (age >= 70){ // >= GREATER THAN, <= LESS THAN, == EQUAL
            System.out.println("You are a boomer");
        }
        else if (age >= 18){
            System.out.println("you are an adult");
        }
        else{ // in else statement you DONT NEED to put value like this else(age>=18)
            System.out.println("you are a minor");
        }
        /*  notice that the first ifStatement is we write greater than 70
         *  its because when the first is have lower value than second if statement
         *  it will have an ERROR
         * 
         *  THE FIRST IF STATEMENT MUST HAVE THE GREATER VALUE THAN THE SECOND OR ANYONE.
        */
     }
}
