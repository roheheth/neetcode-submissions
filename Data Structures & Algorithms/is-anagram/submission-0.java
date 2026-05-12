class Solution {
    public boolean isAnagram(String s, String t) {
        if(t.length() != s.length()) return false;

        int[] inset = new int[26];
        for(int i = 0; i<s.length(); i++){
            inset[s.charAt(i)-'a']++;
            inset[t.charAt(i)-'a']--;
        };

        for(int i = 0; i<26; i++){
            if(inset[i] != 0){
                return false;
            }
        }
        return true;
    }
}
