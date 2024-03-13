class CountOccurence {
    public static void main(String[] args) {
        int arr[] = {10,20,20,30,30,30,30};
        System.out.println(countOcc(arr,30));
    }
    static int countOcc(int arr[],int x){
      int firstOcc = findIndEfficient(arr, x);
      if(firstOcc == -1) return 0;
      int lastOcc = findLastOccurenceBinarySearch(arr, x);
      return ( lastOcc  - firstOcc )+1;
         
    }
    static int findLastOccurenceBinarySearch(int arr[] ,int x){
        int low = 0;
        int high = arr.length-1;
    
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                if(mid==arr.length-1 || arr[mid] != arr[mid + 1] )
                   return mid;
                else 
                  low = mid+1; 
    
            }
            else if(arr[mid] > x){
                high = mid-1;
            }
            else 
             low = mid+1;
        }return -1;
     }
    static int findIndEfficient(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == x){
                
                ans = mid;
                high = mid-1;
            }
            else if(arr[mid] > x){
                high = mid -1;
            }
            else low = mid+1;
        }
        return ans;
    }
}
