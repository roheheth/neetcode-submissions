class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        char[] array = new char[n];
        int top = -1;
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                array[++top] = ch;
            }else{
                if(top == -1) return false;
                if(ch == '}' && array[top] != '{') return false;
                if(ch == ')' && array[top] != '(') return false;
                if(ch == ']' && array[top] != '[') return false;
                else{
                    top--;
                }
            }
        }
        return top == -1;
    }
}
