import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int l1 = word1.length();
        int l2 = word2.length();

        //initialize pointers
        int i = 0;
        int j = 0;

        //append to resultset by looping over both the strings
        while(i<l1 && j<l2)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            i++;
            j++;
        }

        //if word1 is the shorter string
        while(i<l1)
        {
            sb.append(word1.charAt(i));
            i++;
        }
        
        //if word2 is the shorter string
        while(j<l2)
        {
            sb.append(word2.charAt(j));
            j++;
        }

        return sb.toString();
        
    }
}
