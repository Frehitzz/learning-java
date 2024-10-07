public class switchcase {
    public static void main(String[] args){

        String date = "Sunday"; // date have a value of "Sunday"

        switch(date){ // here in the switch and inside of the parenthesis is (date) that have a value of "Friday"
            case "Sunday": System.out.println("It is sunday");
        // the case is if the "date" have a value of "Sunday" it will output "It is sunday"
            break; // in each switch after the case but a "break"

            case "Monday": System.out.println("It is Monday");
            break;

            case "Tuesday": System.out.println("It is Tuesday");
            break;

            case "Wednesday": System.out.println("It is Wednesday");
            break;
        }
    }
}
