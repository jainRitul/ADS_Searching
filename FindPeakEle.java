class FindPeakEle {
    public static void main(String[] args) {
        int arr[] = {5,10,20,15,4};
        System.out.println(findPeak(arr));
        System.out.println(findPeakEfficient(arr));
    }
    static int findPeakEfficient(int arr[]){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while (low <= high) {
            int mid = low + ( high + low )/2;
            if(((mid == 0) || (arr[mid-1] <= arr[mid])) 
                && ( (mid == n-1) || (arr[mid+1] <= arr[mid])) )
              return arr[mid];

            if(arr[mid - 1] >= arr[mid] && mid > 0) {
                high = mid - 1;
            }  
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    static int findPeak(int arr[]){
        int n  = arr.length;
        if(n==1) return arr[0];
        if(n >= 2){
           if(arr[0] > arr[1]) return arr[0]; 
           if(arr[n-1] > arr[n-2]) return arr[n-1];
        }
        for(int i = 1 ;i<n;i++){
            if((arr[i] >= arr[i-1]) && (arr[i+1] <= arr[i]))
              return arr[i];

        }
        return -1;

    }
}
