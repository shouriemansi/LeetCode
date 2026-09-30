class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> tt = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                st.push(ch);
            }
            else{
                if(st.size()==0){
                    continue;
                }
                st.pop();
            }
        }
        for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            if(ch>='a' && ch<='z'){
                tt.push(ch);
            }
            else{
                if(tt.size()==0){
                    continue;
                }
                tt.pop();
            }
        }
        String s1=st.toString();
        String s2=tt.toString();
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
}