import java.util.Arrays;

class RepeatingEle {
    public static void main(String[] args) {
        int arr[] = {0,2,1,3,2,2};
        // System.out.println(findRepeatingEle(arr));
        // System.out.println(findRepeatingEleApproach1(arr));
        // System.out.println(findRepeatingEleApproach2(arr));
        System.out.println(findRepeatingEleApproach3(arr));
    }
    static int findRepeatingEleApproach3(int arr[]){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);
        
        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    static int findRepeatingEleApproach2(int arr[]){
        int n = arr.length;
        int max = arr[0];
        for(int i = 1;i<n;i++){
            max = Math.max(arr[i],max);
        }
        int temp[] = new int[max+1];
        for(int i = 0;i<n;i++){
            temp[arr[i]]++; 
        }
        for(int i = 0;i<n;i++){
            if(temp[i] > 1) return i;
        }
        return -1;

    }
    static int findRepeatingEleApproach1(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i =0;i<n-1;i++)
            if(arr[i] == arr[i+1]) 
              return arr[i];
        return -1;
    }
    static int findRepeatingEle(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
         
            for(int j =i+1;j<n;j++){
                if(arr[i] == arr[j]) 
                  return arr[i];
            }
        }
        return -1;
    }
}
