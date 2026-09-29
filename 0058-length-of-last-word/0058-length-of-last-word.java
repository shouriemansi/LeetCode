class Solution {
    public int lengthOfLastWord(String s) {
        int len=0;
        String[] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            if(i==words.length-1){
                len=words[i].length();
            }
        }
        return len;
    }
}