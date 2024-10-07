import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class buffered {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String name1 = "";
        System.out.println("Enter your name:");
        try{
             name1 = reader.readLine();
        }
        catch (IOException e){
            System.out.println("error!");
        }
        System.out.println(name1);
    }
    
}
