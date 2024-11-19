public class twodArrays {
    public static void main(String[] args){

    int [][] numbers = new int[4][5]; 
        // defining the elements manualy
    numbers[0][0] = 1;
    numbers[0][1] = 2;
    numbers[0][2] = 3;
    numbers[0][3] = 4;
    numbers[0][4] = 5;
    numbers[1][0] = 6;
    numbers[1][1] = 7;
    numbers[1][2] = 8;
    numbers[1][3] = 9;
    numbers[1][4] = 10;
    numbers[2][0] = 11;
    numbers[2][1] = 12;
    numbers[2][2] = 13;
    numbers[2][3] = 14;
    numbers[2][4] = 15;
    numbers[3][0] = 16;
    numbers[3][1] = 17;
    numbers[3][2] = 18;
    numbers[3][3] = 19;
    numbers[3][4] = 20;
    
    // printing all of it
        for(int i = 0; i<numbers.length; i++){
            System.out.println();
            for (int j = 0; j<numbers[i].length; j++){
                System.out.print(numbers[i][j]+"   ");
            }
        }


    }
}
