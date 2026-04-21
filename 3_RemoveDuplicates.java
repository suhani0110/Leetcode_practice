class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0; int j=i+1;
        while(i<n-1 && j<n){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}