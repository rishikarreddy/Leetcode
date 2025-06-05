class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1 || s.length()<=numRows)
        {
            return s;
        }
        StringBuilder result=new StringBuilder();
        int cyclelen=2*numRows-2;
        for(int i=0;i<numRows;i++)
        {
            for(int j=i;j<s.length();j+=cyclelen)
            {
                result.append(s.charAt(j));
                int diagonalen=j+cyclelen-2*i;
                if(i!=0 && i!=numRows-1 &&diagonalen<s.length())
                {
                    result.append(s.charAt(diagonalen));
                }
            }

        }
        return result.toString();
        
    }
}