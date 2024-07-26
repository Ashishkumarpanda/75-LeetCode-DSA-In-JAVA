class Solution {

    public static int findmax(int[] arr)
    {
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int max = findmax(candies);
        for(int i : candies)
        {
            i = i+extraCandies;
            if (i >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
