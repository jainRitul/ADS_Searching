class SearchInSortedRotatedArr {
    public static void main(String[] args) {
        int arr[] = {300,1000,40,50,100,200};
        int x = 1000;
        System.out.println(search(arr,x));
    }
    static int search(int arr[] ,int x){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x)
              return mid;

           if(arr[mid] > arr[low]){
                if(arr[mid] > x && arr[low] <= x){
                    high = mid-1;
                }
                else 
                 low  = mid+1;
            }
            else{
               if(arr[mid] < x && arr[high] >= x ){
                  low = mid+1;              
                }
                else{
                    high = mid-1;
                } 
            }

        }return -1;
    }
}
