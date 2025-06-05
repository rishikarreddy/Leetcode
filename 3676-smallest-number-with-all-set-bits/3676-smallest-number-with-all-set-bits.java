class Solution {
    public int smallestNumber(int n) {
        if ((n&(n+1))==0)
            return n;
        else{
            int p=Integer.toBinaryString(n).length();
            return (1<<p)-1;
        }
        
    }
}