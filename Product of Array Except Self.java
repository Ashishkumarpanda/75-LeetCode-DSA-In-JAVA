class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];

        //fill the left array
        left[0] = 1;
        for(int i=1;i<n;i++)
        {
            left[i] = nums[i-1]*left[i-1];
        }

        //fill right array
        right[n-1] = 1;
        for(int i=n-2;i>=0;i--)
        {
            right[i] = nums[i+1] * right[i+1];
        }

        int[] result = new int[n];
        for(int i=0;i<n;i++)
        {
            result[i] = left[i]*right[i];
        }

        return result;

    }
}
