class searchPosition {
    public static int searchInsertK(int arr[], int k) {
        // code here
        int left =0, right = arr.length-1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            
            if(arr[mid] == k){
                return mid;
            }
            
            else if(arr[mid] > k){
                right = mid - 1;
            }
            
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 9};
        int k = 7;

        System.out.println(searchInsertK(arr, k));        
    }
}
