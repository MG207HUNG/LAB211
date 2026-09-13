public class Function {
    public static int LinearSearch(int arr[],int SearchValue){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==SearchValue){
                return i;
            }
        }
        return -1;
    }
}
