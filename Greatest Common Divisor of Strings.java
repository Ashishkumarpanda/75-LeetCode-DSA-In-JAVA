class Solution {

    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public String gcdOfStrings(String str1, String str2) {

        //check if both string have a common divisor
        if(!((str1+str2).equals(str2+str1)))
        {
            return "";
        }
        else
        {
            int gcdLength = gcd(str1.length(),str2.length());

            //result will be a substring from 0 to the gcd length from any string
            return str1.substring(0,gcdLength);
        } 
    }
}
