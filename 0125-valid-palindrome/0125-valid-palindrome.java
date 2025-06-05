class Solution {
    public boolean isPalindrome(String s) {
        // without regex and using string builder;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch)|| Character.isDigit(ch))
            {
            sb.append(ch);
            }
        }
        String result=sb.toString();
        result=result.toLowerCase();
      
        

        int left=0;
        int right=result.length()-1;
        while(left<right)
        {
            if(result.charAt(left)==result.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
            
        }
        return true;
        
    }
}