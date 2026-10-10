class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                st.push(ch);
            }
            else{
                st.pop();
            }
        }
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}