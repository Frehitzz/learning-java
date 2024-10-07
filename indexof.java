import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class indexof {
    public static void main(String[] args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String sentenz = "";
    String wordf = "";
    
    try {
        System.out.print("Enter a sentence: ");
        sentenz = dataIn.readLine();

        System.out.print("\nEnter what word do you want to locate: ");
        wordf = dataIn.readLine();
    } 
    catch (Exception e) {
    System.out.println("Error!");
    }
    sentenz = sentenz.replace(" ","");
        System.out.println("It starts with: "+sentenz.indexOf(wordf));
  }
}
