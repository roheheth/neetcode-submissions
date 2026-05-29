class Solution {
    public String mergeAlternately(String word1, String word2) {
        int flag = 0;
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {

            if (flag == 0) {

                if (i < word1.length()) {
                    sb.append(word1.charAt(i));
                    i++;
                }

                if (j >= word2.length()) {
                    flag = 0;
                } else {
                    flag = 1;
                }

            } else {

                if (j < word2.length()) {
                    sb.append(word2.charAt(j));
                    j++;
                }

                if (i >= word1.length()) {
                    flag = 1;
                } else {
                    flag = 0;
                }
            }
        }

        return sb.toString();
    }
}