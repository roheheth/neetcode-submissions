class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] stack = new char[n];
        int top = -1;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                stack[++top] = ch;
            }else{
                if(top == -1)return false;
                if(ch == ')' && stack[top] != '(') return false;
                if(ch == ']' && stack[top] != '[') return false;
                if(ch == '}' && stack[top] != '{') return false;
                else{
                    top--;
                }
            }
        }
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
}
