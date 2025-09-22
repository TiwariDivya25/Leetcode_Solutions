# Last updated: 22/09/2025, 08:58:39
class Solution(object):
    def moveZeroes(self, nums):
        k=0
        for i in range(len(nums)):
            if nums[i]!=0:
                nums[i],nums[k]=nums[k],nums[i]
                k=k+1