class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long totalzeros=0;
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                current+=1;
                totalzeros+=current;


            }
            else
            {
                current=0;
            }
            
        }
        return totalzeros;
        
    }
}