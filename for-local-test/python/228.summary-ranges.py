class Solution:
    def summaryRanges(self, nums: list[int]) -> list[str]:
        answer = []
        if len(nums) == 0:
            return answer
        start = nums[0]
        for i in range(1, len(nums)):
            if nums[i] != nums[i - 1] + 1:
                if start == nums[i - 1]:
                    answer.append(str(start))
                else:
                    answer.append(str(start) + "->" + str(nums[i - 1]))
                start = nums[i]
        if start == nums[-1]:
            answer.append(str(start))
        else:
            answer.append(str(start) + "->" + str(nums[-1]))
        return answer
    
if __name__ == "__main__":
    solution = Solution()
    nums = [0,1,2,4,5,7]
    print(solution.summaryRanges(nums))