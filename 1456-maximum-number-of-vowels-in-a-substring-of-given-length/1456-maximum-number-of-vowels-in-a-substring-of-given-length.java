class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int vowel_count=0;
        int max_count=0;
        for(int right=0;right<s.length();right++){
            char r=s.charAt(right);
            char l=s.charAt(left);
            if(r=='a' || r=='e' || r=='i' || r=='o' || r=='u'){
                vowel_count++;
            }
            if(right-left+1>k){
                if(l=='a' || l=='e' || l=='i' || l=='o' || l=='u'){
                    vowel_count--;
                }
                left++;
            }
            if(right-left+1==k){
                max_count=Math.max(max_count, vowel_count);
            }
        }
        return max_count;
    }
}