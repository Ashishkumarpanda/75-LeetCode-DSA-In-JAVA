class Solution {
    public boolean isSubsequence(String s, String t) {

        int p1 = 0;
        int p2 = 0;

        //handle blank string
        if(s.length() == 0)
        {
            return true;
        }

        //traverse through second string
        while(p2<t.length())
        {
            //check if same char matches
            if(s.charAt(p1) == t.charAt(p2))
            {
                //increase pointer 1
                p1++;

                //check if all charecter checked for first string
                if(p1 == s.length())
                {
                    return true;
                }
            }

            //increase pointer 2
            p2++;
        }

    return false;
    }
}
