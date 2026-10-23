class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] words=s.split("\\s+");
        String[] result=new String[words.length];
        int j=0;
        for(int i=words.length-1;i>=0;i--){
            result[j]=words[i];
            j++;
        }
        String new_result=String.join(" ",result);
        return new_result;
    }
}