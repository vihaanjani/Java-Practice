class Solution {
    /*public boolean isPowerOfTwo(int n) {
        int num = n;
        if(n == 1)
            return true;
        return searchHelper(1, n, n);
    }

    public boolean searchHelper(int l, int h, int t){
        int mid = l + (h-l)/2;
        long check = (long) Math.pow(2, mid);
        if(l > h) return false;
        if(check == t)
            return true;
        if(check > t)
            return searchHelper(l, mid-1, t);
        return searchHelper(mid+1, h, t);
    } */ 
    
    //without using recursion

    /*public boolean isPowerOfTwo(int n){
        if( n <= 0)
            return false;
        while(n%2 ==  0){
            n = n/2;
        } return n == 1;

    } */

    //without while loop or recursion

    public boolean isPowerOfTwo(int n){
        return n > 0 && (n & (n-1)) == 0;

        //negative n values and 0 would not be power of two
        //n & n-1 clears the 1 from binary, if all == 0 then its a power of two
        //this is because all power of two(binary system) only have a single 1 in their binary notation
        //by classing n & n - 1, that AND(&) clears that 1 by adding n's notation with n-1's notation
        //in this way if that call isn't equal to zero (0000 0000) then the number n isnt a power of two. So return false;
    }
}
