import java.util.Arrays;

public class Main {
     static void main(String[] args) {
        System.out.println("Enter number of array:");
        int RangeOfArray = Input.InputPositiveInteger();
        int[] UnsortedArray = Input.ArrayWithRandomNumb(RangeOfArray);
        int[] SortedArray= Function.BubbleSort(UnsortedArray);
        System.out.println("Sorted Array: "+ Arrays.toString(SortedArray));
        System.out.println("Enter search value:");
        int SearchValue = Input.InputPositiveInteger();
        int Result = Function.BinarySearch(SearchValue,SortedArray,0,RangeOfArray-1);
        if(Result==-1){
            System.out.println("The number is not in the array!!");
        }
        else
        System.out.println("Found "+SearchValue+" at index: "+Result);
    }
}
