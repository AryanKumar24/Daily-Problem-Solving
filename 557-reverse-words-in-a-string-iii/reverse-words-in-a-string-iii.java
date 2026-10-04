class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            String rev = "";

            for(int j = word.length() - 1; j >=0; j--) {
                rev = rev + word.charAt(j);
            }
            ans = ans + rev + " ";
        }
        return ans.trim();
    }
}