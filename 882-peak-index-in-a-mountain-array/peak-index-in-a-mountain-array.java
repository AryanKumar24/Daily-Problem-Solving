class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int answer = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[answer]) {
                answer = i;
            }
        }
        return answer;
    }
}