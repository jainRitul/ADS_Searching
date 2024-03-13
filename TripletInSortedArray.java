class TripletInSortedArray {
    public static void main(String[] args) {
        int arr[] = {2,3,4,8,9,20,40};
        int x = 32;
        System.out.println(tripletFromArr(arr,x));
        System.out.println(tripletFromArrEfficient(arr,x));
        System.out.println(tripletFromArrEfficientTwo(arr,x));
    }
    static boolean tripletFromArrEfficientTwo(int arr[],int x){
        int n = arr.length;

        for(int i =0;i<n-2;i++)
            if(isPair(arr,x-arr[i] ,i+1,n)) return true;
            
        return false;
    }
    static boolean isPair(int arr[],int sum ,int s,int n){
        int i = s;
        int j = n-1;
        while(i<j){
            if(arr[i] + arr[j] == sum){
                return true;
            }
            if(arr[i] + arr[j] > sum){
                j--;
            }
            else{
                i++;
            }
        }return false;
    }
    static boolean tripletFromArrEfficient(int arr[],int x){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                if(sum == x){
                    return true;
                }
                if(sum > x){
                    right --;
                }
                else
                  left++;
            }
        }
        return false;
    }
    static boolean tripletFromArr(int arr[],int x){
        int n = arr.length;
        for(int i = 0;i<n-2;i++){
            for(int j = i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i] + arr[j] + arr[k] == x) return true;
                }
            }
        }
        return false;
    }
}
