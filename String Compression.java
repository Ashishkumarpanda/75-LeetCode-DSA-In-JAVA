class Solution {
    public int compress(char[] chars) {
        int read = 0;
        int write = 0;

        //loop through array to count occurance
        while(read<chars.length)
        {
            //count number of occurances
            int count = 0;

            //current char
            char current = chars[read];

            //count occurance
            while(read<chars.length && chars[read] == current)
            {
                read++;
                count++;
            }

            //write to array
            chars[write++] = current;

            //for multiple occurance convert count to string and add to array
            if(count > 1)
            {
                for(char c:Integer.toString(count).toCharArray())
                {
                    chars[write++] = c;
                }
            }
        }
        return write;
        
    }
}
