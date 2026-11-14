class Solution {
    public int search(int[] nums, int target) {
        int ans = searchHelper(nums, target, 0, nums.length-1);
        return ans;
    }

    public int searchHelper(int[] n, int t, int l, int h){
        int mid = l + (h - l) / 2;
        if (l > h) return -1;
        if(n[mid] == t)
            return mid;
        if(n[mid] > t)
            return searchHelper(n, t, l, mid-1);
    
        return searchHelper(n, t, mid+1, h);
        
    }
}
