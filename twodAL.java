import java.util.ArrayList;
public class twodAL{
public static void main(String[] args) {

    ArrayList<ArrayList<String>> low_item = new ArrayList();
    
    ArrayList<String> breakfastList = new ArrayList<String>();
    breakfastList.add("eggsilog");
    breakfastList.add("hotsilog");
    
    ArrayList<String> lunchList = new ArrayList<String>();
    lunchList.add("sisig");
    lunchList.add("porkchop");
    
    ArrayList<String> drinkList = new ArrayList<String>();
    drinkList.add("Cola");
    drinkList.add("Dew");
    
   
    low_item.add(breakfastList);
    low_item.add(lunchList);    
    low_item.add(drinkList);

    
    System.out.println(low_item.get(0).get(0)); 
    }
}

    

