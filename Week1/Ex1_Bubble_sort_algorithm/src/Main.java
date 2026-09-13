import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Input input = new Input();
        int n = input.InputPositiveInteger();
        int[] UnsortedArrray = input.ArrayWithRandomNumb(n);
        System.out.println("UnsortedArray: "+ Arrays.toString(UnsortedArrray));
        int[] SortedArray= Function.BubbleSort(UnsortedArrray);
        System.out.println("SortedArray: "+ Arrays.toString(SortedArray));
    }
}
