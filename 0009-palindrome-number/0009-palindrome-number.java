class Solution {
    public boolean isPalindrome(int x) {
        int m=x;
    
        int ans=0;
        if(x>0){
        while(x!=0){
            int r=x%10;
            ans=(10*ans)+r;
            x=x/10;
        }}
        if(ans==m)
        return true;
        else
        {
        return false;
    }}
}