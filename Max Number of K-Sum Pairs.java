class Solution {  
    public int maxOperations(int[] nums, int k) {

        //sort nums using shell sort
        for(int gap = nums.length/2;gap>0;gap/=2)
        {
            for(int i=gap;i<nums.length;i++)
            {
                int newElement = nums[i];
                int j = i;
                while(j>=gap && nums[j-gap] > newElement)
                {
                    nums[j] = nums[j-gap];
                    j-=gap;
                }
                nums[j] = newElement;
            }
        }

        int left = 0;
        int right = nums.length-1;
        int count = 0;
        while(left<right)
        {
            int sum = nums[left]+nums[right];
            if(sum == k)
            {
                count++;
                left++;
                right--;
            }
            else if(sum < k)
            {
                left++;
            }
            else
            {
                right--;
            }
        }

        return count;
    }
}
