class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double maxsum=Double.NEGATIVE_INFINITY;
        int left=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            if(right-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(right-left+1==k){
                maxsum=Math.max(maxsum, sum);
            }
        }
        return maxsum/k;
    }
}