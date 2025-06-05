class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int correctindex=nums[i]-1;
            if(nums[i]>0 && nums[i]<=n && nums[i]!=nums[correctindex])
            {
                swap(nums,i,correctindex);
            }
            else
            {
                i++;
            }
        }
         for( i=0;i<n;i++)
        {
            if(nums[i]!=i+1)
            {
                return i+1;
            }
        }
        return n+1;
        }
      public static  void swap(int nums[],int index1,int index2)
        {
            int temp=nums[index1];
            nums[index1]=nums[index2];
            nums[index2]=temp;

        }
       
        
    }
