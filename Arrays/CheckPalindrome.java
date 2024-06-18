package Arrays;
import java.util.*;

public class CheckPalindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Input ---> "+s);
        System.out.println(checkPalindrome(s));
    }

    public static boolean checkPalindrome(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length-1;
        while (start<end)
        {
            if (chars[start] != chars[end])
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
