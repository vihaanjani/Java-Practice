class Solution{
    public boolean isPerfectSquare(int x){
        return searchHelper(1, x, x);
    }

    public boolean searchHelper(int low, int high, int target){
        int mid = low + (high-low)/2;
        long square = (long) mid * mid; //to make sure IntegerOverflow doesnt happen
        //integer overflow here causes StackOverflow at Line 13 and 14
        if(low > high)
            return false;
        if(square == target)
            return true;
        if(square < target)
            return searchHelper(mid+1, high, target);

        return searchHelper(low, mid-1, target);   
    }
}
