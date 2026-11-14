class Solution{
    /*public boolean isPalindrome(int x){
        if(x < 0 || x % 10 == 0 && x != 0)
            return false;
        if(x == 0)
            return true;
        String y = x + "";
        int l = 0;
        int h = y.length() - 1;
        while(l < h){
            if(y.charAt(l) != y.charAt(h))
                return false;
            l++;
            h--;
        }
        return true;
    } */ //Works but is slow

    public boolean isPalindrome(int x){
        if(x < 0)
            return false;
        int original = x;
        int reversed = 0;

        while( x > 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }
}
    

