class Solution(object):
    def maximumBeauty(self, nums, k):
     
        
        nums.sort()
        ml=1
        l=0
        for r in range(1,len(nums)):
            while nums[r]-nums[l]>2*k:
                 l+=1
            ml=max(ml,r-l+1)
        return ml
        
        