import java.util.Random;
import java.util.Scanner;

public class Input {
    public static int InputPositiveInteger(){
        Scanner scanner = new Scanner(System.in);
        String UserInput;
        int n;
        while(true){
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
            Numbers[i] = random.nextInt(0, 11);
        }
        return Numbers;
    }
}
