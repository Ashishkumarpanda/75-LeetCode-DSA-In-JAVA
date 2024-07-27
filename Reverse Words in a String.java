class Solution {
    public String reverseWords(String s) {

        String[] data = s.trim().split("\\s+");
        ArrayList<String> result = new ArrayList<>();
        for(int i=data.length-1;i>=0;i--)
        {
            result.add(data[i]);
        }

        return String.join(" ",result);
    }
}
