class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int total=0;
        for(int num:nums){
            total+=num;
        }
        return expectedSum-total;
        
    }
}