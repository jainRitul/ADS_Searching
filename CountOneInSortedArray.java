class CountOneInSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,0,1};
        System.out.println(findNoOfOccurences(arr));
    }
    static int findNoOfOccurences(int arr[]){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int firstOcc = -1;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] == 0){
                low = mid + 1; 
            }
            else{
                if(mid ==0 || arr[mid] != arr[mid-1]){
                    firstOcc = mid;
                    break;
                }
                else{
                    high = mid-1;
                }
            }
        }
        if(firstOcc == -1) return firstOcc;
        return (n-1 - firstOcc )+1;

        
    }
}
