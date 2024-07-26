class Solution {
    public String reverseVowels(String s) {

        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right)
        {
            while(left<right && !vowels.contains(arr[left]))
            {
                left++;
            }
            while(left<right && !vowels.contains(arr[right]))
            {
                right--;
            }
            if(left<right)
            {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
        
    }
}
