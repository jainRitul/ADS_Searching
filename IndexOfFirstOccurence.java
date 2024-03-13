class IndexOfFirstOccurence{
    public static void main(String[] args) {
        int arr[] = {20,20,20,20};
        System.out.println(findInd(arr,20));
        System.out.println(findIndEfficient(arr,20));
    }
    static int findIndEfficient(int arr[],int x){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = low + high/2;
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
    static int findInd(int arr[],int x){
         for(int i=0;i<arr.length;i++){
            if(arr[i] == x)
              return i;
         }
         return -1;
    }
}