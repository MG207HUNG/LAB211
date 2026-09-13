public class Function {
       public static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right)/2];
        int i = left - 1 , j = right + 1 ;
        while(true){
            do{
                ++i;
            }while (arr[i] < pivot);
            do {
                --j;
            }while (arr[j] > pivot);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else return j ;
        }
    }
    public static void QuickSort(int[] arr, int left, int right) {
        if(left >= right ) return ;
        int p =  partition(arr, left, right);
        QuickSort(arr, left, p );
        QuickSort(arr, p + 1, right);
    }

}
