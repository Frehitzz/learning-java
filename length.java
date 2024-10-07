import java.util.Scanner;
public class length {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String userinput = input.nextLine();

        userinput = userinput.replace(" ",""); // to not count the spaces

        System.out.println("It have: "+userinput.length()+ " letters");

    }

}