class Solution {
    public int largestPerimeter(int[] nums) {
         //bubble sort
        for (int pass = 1; pass < nums.length; pass++) {
            for (int i = 0; i < nums.length - pass; i++) {
                if (nums[i] > nums[i + 1]) {
                    nums[i] = nums[i] ^ nums[i + 1];
                    nums[i + 1] = nums[i + 1] ^ nums[i];
                    nums[i] = nums[i] ^ nums[i + 1];
                }
            }
        }

        // check from last
        int perimeter = 0;
   
        for (int j = nums.length-1; j > 0; j--) {
            if(j>1){
            if ((nums[j - 1] + nums[j - 2]) > nums[j]) {
                perimeter = (nums[j - 1] + nums[j - 2] + nums[j]);
                break;
            }
   // else if(j==1)
   //     break;
            }
            else
                break;