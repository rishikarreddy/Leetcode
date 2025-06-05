class Solution(object):
    def constructTransformedArray(self, nums):
        n=len(nums)
        result=[0]*n
        for i in range(n):
            if nums[i]==0:
                result[i]=nums[i]
            else:
                st=nums[i]
                di=(i+st)%n
                result[i]=nums[di]
        return result