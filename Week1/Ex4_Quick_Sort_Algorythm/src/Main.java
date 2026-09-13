import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter number of array:");
        int n = input.InputPositiveInteger();
        int[] UnsortedArray = input.ArrayWithRandomNumb(n);
        System.out.println("Unsorted Array: "+ Arrays.toString(UnsortedArray));
        Function.QuickSort(UnsortedArray, 0, UnsortedArray.length - 1);
        System.out.println("Sorted Array: "+ Arrays.toString(UnsortedArray));
    }
}
