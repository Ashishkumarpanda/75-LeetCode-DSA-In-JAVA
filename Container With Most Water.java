class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right)
        {
            int h = Math.min(height[left],height[right]);
            int w = right-left;
            int newArea = h*w;

            maxArea = Math.max(maxArea,newArea);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}
