class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        int currIndex = 0;
        ans[0] = currIndex;
        boolean found = false;
        while(currIndex < nums.length && found == false){

            for(int i = currIndex + 1; i < nums.length; i++){
                if((nums[currIndex] + nums[i]) == target){
                    ans[1] = i;
                    found = true;
                }
            } 
            ans[0] = currIndex;
            currIndex++;
        }  

        return ans;
    }
}
