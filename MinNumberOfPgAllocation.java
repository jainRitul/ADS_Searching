class MinNumberOfPgAllocation {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40};
        int k = 2;
        System.out.println(findMinNumberofPg(arr,k));
        System.out.println(findMinNumberofPgRecursive(arr,arr.length,k));
    }
    static int findMinNumberofPgRecursive(int arr[],int n,int k){

        if(k==1) 
          return findSum(arr, 0, n-1);

        if(n==1) 
          return arr[0];
         
        int  res = Integer.MAX_VALUE;  
        for(int i = 1;i<n;i++){
            res = Math.min(res,Math.max(findMinNumberofPgRecursive(arr, i, k-1)
                                   ,findSum(arr, i, n-1)));
        }  
        return res;
    }
    static int findSum(int arr[],int s,int e){
        int sum = 0;
        for(int i = s;i<=e;i++){
            sum+=arr[i];

        }
        return sum;
    }
    static boolean isValid(int arr[],int n,int k,int mid){
        int student = 1;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += arr[i];
            if(sum > mid){
                student++;
                sum = arr[i];
            }
            if(student > k) return false;
        }return true;
    }
    static int findMinNumberofPg(int arr[] ,int k){
        int n = arr.length;
        if(n < k) return -1;

        int max = arr[0];
        int sum = arr[0];
        for(int i =0;i<n;i++){
            max = Math.max(max, arr[i]);
            sum += arr[i];

        }
        int s = max;
        int end = sum;
        int res = -1;
        while (s <= end) {
            int mid = s + (end - s)/2;

            if(isValid(arr,n,k,mid)){
                res = mid;
                end = mid-1;
            }
            else{
                s = mid+1;
            }
        }return res ;


    }


}