class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length; int i = 0;
        if(nums == null || n==0) return new int[0];
        int[] result = new int[n];
        int temp = 1; int rp =1;
        for(i=0; i<n; i++){
            rp = rp*temp;
            result[i] = rp;
            temp = nums[i];
        }
        for(i=n-1; i>=0; i--){
            rp = rp*temp;
            result[i] = result[i]*rp;
            temp = nums[i];
        }
        return result;
    }
}
