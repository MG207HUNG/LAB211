import java.util.Scanner;

public class Input {
    public static String InputContent(){
        System.out.println("Enter your content:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
