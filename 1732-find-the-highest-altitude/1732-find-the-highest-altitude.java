class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int psum[]=new int[n+1];
        for(int i=0;i<n;i++){
            psum[i+1]=psum[i]+gain[i];
        }
        int maxi=0;
        for(int i=0;i<psum.length;i++){
            maxi=Math.max(maxi, psum[i]);
        }
        return maxi;
    }
}