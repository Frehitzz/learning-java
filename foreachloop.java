import java.util.ArrayList;
public class foreachloop {
    public static void main(String[] args){

        String[] name = {"Fritz","Harly","Christine","Aia"};

        System.out.println("ARRAY for-each: ");
        for(String i : name){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("\nARRAY for-loop: ");
        for(int i=0; i < name.length;i++){
            System.out.print(name[i]+" ");
            
        }

        System.out.println("\n=============================");

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("yellow");
        colors.add("black");
        colors.add("orange");
        colors.add("pink");

        System.out.println("ARRAYLIST for-each: ");
        for(String j : colors){
            System.out.print(j + " ");
        }

        System.out.println();
        
        System.out.println("\nARRAYLIST for-loop: ");
        for(int i=0;i < colors.size(); i++){
            System.out.print(colors.get(i)+" ");
        }
       

    }
}
