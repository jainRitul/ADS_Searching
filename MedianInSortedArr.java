class MedianInSortedArr{
    public static void main(String[] args) {
        int a[] = {10,20,30,40};
        int b[] = {1,2,3,4};
        System.out.println(findMedian(a,b));
    }
    static double findMedian(int a[],int b[]){
        int n = a.length;
        int m = b.length;
        int arr[] = new int[n+m];
        int i=0, j=0, k=0;
        while (i<n && j<m) {
            if(a[i] <= b[j]){
                arr[k++] = a[i++]; 
            }
            else{
                arr[k++] = b[j++];
            }
        }   
        while (i<n) {
            arr[k++] = a[i++];
        }
        while (j<m) {
            arr[k++] = b[j++];
        }

        int o = arr.length;
        int mid = o/2;
        if(o % 2 == 0){
           return (arr[mid] + arr[mid-1])/2.0; 
        }
        return arr[mid];
        
    }
}