import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        System.out.println("Enter number of array:");
        int RangeOfArray = Input.InputPositiveInteger();
        int[] UnsortedArray = Input.ArrayWithRandomNumb(RangeOfArray);
        System.out.println("Unsorted Array:"+ Arrays.toString(UnsortedArray));
        System.out.println("Enter search value:");
        int SearchValue = Input.InputPositiveInteger();
        int Result = Function.LinearSearch(UnsortedArray,SearchValue);
        if(Result==-1){
            System.out.println("The number is not in the array!!");
        }
        else
            System.out.println("Found "+SearchValue+" at index: "+Result);
    }
}

