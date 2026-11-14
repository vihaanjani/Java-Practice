class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int[] vals = new int[nums.length];
        int index= 0;
        for(int i = 0; i<nums.length;i++){
            if(nums[i] == val)
                k--;
            else
            {
                vals[index] = nums[i];
                index++;
            }
        } 
        for(int i = 0; i<nums.length;i++){
            nums[i] = vals[i];
        }
        return k;  
    }
}
