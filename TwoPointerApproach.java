class TwoPointerApproach {
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,11,20,30};
        int sum = 23;
        // System.out.println(findPair(arr,sum));
        // System.out.println(findPairEfficient(arr,sum));
        System.out.println(findPairEfficientTwo(arr,sum));
    }

    static boolean findPairEfficientTwo(int arr[],int sum){
        int n  = arr.length;
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i] + arr[j] == sum) return true;

            if(arr[i] + arr[j] > sum ){
                j =j-1;
            }
            else
              i = i+1;
        }return false;
    }
    static boolean findPairEfficient(int arr[],int sum){
        int n  = arr.length;
        if(n==1) 
          return sum==arr[0];
        int slow = 0;
        int fast = 1;
        while(fast < n){
            if(arr[slow] + arr[fast] == sum) return true;
        }
        return false;


    }
    static boolean findPair(int arr[],int sum){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i] + arr[j] == sum) return true;
            }
        }
        return false;
    }
}
