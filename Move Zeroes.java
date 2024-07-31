class Solution {

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pointer = 0;
        for(int k : nums)
        {
            if(k!=0)
            {
                nums[pointer] = k;
                pointer++;
            }
        }

        for(int i=pointer;i<n;i++)
        {
            nums[i] = 0;
        }
    }
}
