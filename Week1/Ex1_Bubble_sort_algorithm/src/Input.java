import java.util.Random;
import java.util.Scanner;

public class Input {
    Scanner scanner = new Scanner(System.in);
    public int InputPositiveInteger(){
        String UserInput;
        int n;
        while(true){
            System.out.println("Enter number of array:");
            UserInput = scanner.nextLine();
            try{
                n = Integer.parseInt(UserInput) ;
                if(n<=0){
                    System.out.println("You must enter an positive integer number!!");
                }
                else{
                    return n;
                }
            }
            catch (NumberFormatException e){
                System.out.println("You must enter an positive integer number!!");
            }
        }
    }
    public static int[] ArrayWithRandomNumb(int n){
        Random random = new Random();
        int[] Numbers = new int[n];
        for (int i = 0; i < n; i++) {
            Numbers[i] = random.nextInt(1, 11);
        }
        return Numbers;
    }
}
