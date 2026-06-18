class Solution {
    public String longestPalindrome(String s) {
        String cur = "";
        for(int i = 0; i<s.length(); i++){
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            String temp = s.substring(left+1, right);
            if(temp.length() > cur.length()){
                cur = temp;
            }

            left = i-1;
            right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }
            temp = s.substring(left+1, right);
            if(temp.length() > cur.length()){
                cur = temp;
            }
        }
        return cur;
    }
}
