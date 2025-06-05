class Solution:
    def subarraySum(self, nums: List[int]) -> int:
        a=0
        n=len(nums)
        for i in range(n):
            a+=sum(nums[max(0,i-nums[i]):i+1])
        return a
            
        