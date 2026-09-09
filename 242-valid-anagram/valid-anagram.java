class Solution {
    public boolean isAnagram(String s, String t) {
        char[] checks = s.toCharArray();
        char[] checkt = t.toCharArray();
        Arrays.sort(checks);
        Arrays.sort(checkt);

        if(checks.length != checkt.length) {
            return false;
        }

        for(int i = 0; i < checks.length; i++) {
            if(checks[i] != checkt[i]) {
                return false;
            }
        }
        return true;
    }
}