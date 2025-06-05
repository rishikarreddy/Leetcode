class Solution {
    public int buttonWithLongestTime(int[][] events) {
        int mt=events[0][1];
        int lb=events[0][0];
        for(int i=1;i<events.length;i++)
            {
                int tt=events[i][1]-events[i-1][1];
                if(tt>mt||(tt==mt &&events[i][0]<lb)){
                    mt=tt;
                    lb=events[i][0];
                    
                }
            }
        return lb;
        
    }
}