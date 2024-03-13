class MajorityElement {
    public static void main(String[] args) {
        int arr[]  = {8,3,4,8,8};
        System.out.println(findMaj(arr));
        System.out.println(findMajEfficient(arr));
    }
    static int findMajEfficient(int arr[]){
        int n = arr.length;
        int count = 0;
        int maj = -1;
        for(int i =0;i<n;i++){
            if(count == 0){
                maj = arr[i];
                count = 1;
            }
            else if(arr[i] == maj)
            count++;
            else  count--;
          
        }
        return maj;
    }
    static int findMaj(int arr[]){
        int n = arr.length;
        for(int i = 0 ;i<n;i++){
            int count = 1;
            for(int j = i+1;j<n;j++){
                 if(arr[i] == arr[j])
                   count++;
            }

            if(count > n/2) return arr[i];
        }
        return -1;
    }
}
