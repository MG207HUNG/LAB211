public class Function {
    public static void QuickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int index = partition(arr, start, end);
        QuickSort(arr, start, index-1);
        QuickSort(arr, index , end);
    }
    public static int partition(int[] arr, int start, int end) {
        int pivotValue = arr[(start + end) / 2];
        int i = start;
        int j = end;

        while (i <= j) {
            while (arr[i] < pivotValue) {
                i++;
            }
            while (arr[j] > pivotValue) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }

}
