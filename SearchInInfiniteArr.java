class SearchInInfiniteArr {
    public static void main(String[] args) {
        int arr[] = {1,10,100,130,150};
        System.out.println(findInInfiniteArr(arr,100));
        System.out.println(findInInfiniteArrEfficient(arr,130));
    }
    static int findInInfiniteArrEfficient(int arr[],int x){
        if(arr[0] == x) return 0;
        int i =1;
        while (arr[i] < x) {
            i = i *2;
        }
        if(arr[i] == x) return i;
       return binarySearch(arr,(i/2)+ 1, i-1,x);

    }
    static int binarySearch(int arr[],int l,int h,int x){
      

        while (l <= h) {
            int m = l+(h-l)/2;

            if(arr[m] == x)
              return m;
            else if(arr[m] > x)
              l = m-1;
            else 
              h = m + 1;   
        }
        return -1;
    }

    
    static int findInInfiniteArr(int arr[],int x){
        int i = 0;
        while (true) {
            if(arr[i] == x)
                return i;
            if(arr[i] > x) 
               return -1;

            i++;   
        }
    }
}
