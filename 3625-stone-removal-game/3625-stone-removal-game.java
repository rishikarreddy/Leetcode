class Solution {
    public boolean canAliceWin(int n) {
        int s=n;
        int r=10;
        boolean a=true;
        while(s>0)
        {
            if(s<r)
            {
                return !a;
             }
            s-=r;
            r--;
            a=!a;
         }
        return !a;
        
  }
}
    
       