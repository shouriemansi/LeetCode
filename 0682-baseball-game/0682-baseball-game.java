class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int num = st.peek();
                int res = 2* num;
                st.push(res);
            }
            else if(operations[i].equals("+")){
                int top = st.pop();
                int sec = st.peek();
                int sum = top+sec;
                st.push(top);
                st.push(sum);
            }
            else{
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }
        }
        int result=0;
        while(st.size()>0){
            result+=st.pop();
        }
        return result;
    }
}