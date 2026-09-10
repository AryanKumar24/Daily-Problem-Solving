class Solution {
    public String toLowerCase(String s) {
        char[] checks = s.toCharArray();
        for(int i = 0; i < checks.length; i++) {
            checks[i] = Character.toLowerCase(checks[i]);
        }
        String s1 = new String(checks);
        return s1;
    }
}