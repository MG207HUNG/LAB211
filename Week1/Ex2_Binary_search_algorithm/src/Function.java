public class Function {
    public static int[] BubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j] ;
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static int BinarySearch(int SearchValue,int[] Numbers,int left,int right){
        if(left > right) {
            return -1;
        }
        int mid = (left+right)/2;
        if(Numbers[mid]==SearchValue){
            return mid;
        } else if (Numbers[mid]>SearchValue) {
            return BinarySearch(SearchValue,Numbers,left,mid-1);
        } else {
                return BinarySearch(SearchValue,Numbers,mid+1,right);
            }
        }

}
