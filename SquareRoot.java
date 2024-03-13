class SquareRoot {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(findSqRootOfX(x));
        System.out.println(findSqRootOfXEfficient(x));
    }
    static int findSqRootOfXEfficient(int x){
        int low = 0;
        int high = x;
        int ans = -1;
        while(low <= high) {
            int mid = low + (high - low)/2;
            int midSq = mid * mid;
            if(midSq > x){
                high = mid  -1;
            }
            else if(midSq < x){
                ans = mid;
                low = mid+1;
            }
            else
                return mid;
        
        }
        return ans;
    }

    static int findSqRootOfX(int x){
      int i =1;
      while(i*i <= x){
          i++;
      }
      return i-1;
      
    }
}
