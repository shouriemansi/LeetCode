class Solution {
    public int[] buildArray(int[] nums) {
      int ans[]=new int[nums.length];
      int counter=0;
      for(int i=0;i<nums.length;i++){
        counter=nums[i];
        ans[i]=nums[counter];
      }  
      return ans;
    }
}