class IndexOfLastOccurence {
 public static void main(String[] args) {
    int arr[] = {40,40,40,40};
    System.out.println(findLastOccurence(arr,20));
    System.out.println(findLastOccurenceBinarySearch(arr,40));
 }
 static int findLastOccurenceBinarySearch(int arr[] ,int x){
    int low = 0;
    int high = arr.length-1;

    while(low <= high){
        int mid = low + high/2;
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
 static int findLastOccurence(int arr[],int x){
    for(int i = arr.length-1;i>=0;i--){
        if(arr[i] == x){
            return i;
        }
    }
    return -1;
 }
  
}
