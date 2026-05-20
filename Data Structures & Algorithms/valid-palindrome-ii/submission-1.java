class Solution {
    public boolean isPalindrome(String a, int l, int r){
        while(l<=r){
            if(a.charAt(l) == a.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        int count = 0;
        while(l<=r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isPalindrome(s, l, r-1)|| isPalindrome(s, l+1, r);
            }
        }
        return true;
    }
}