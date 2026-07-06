class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = set("aeiouAEIOU")
        s_list = list(s)
        left, right = 0, len(s) - 1
        
        while left < right:
            while left < right and s_list[left] not in vowels:
                left += 1
            while left < right and s_list[right] not in vowels:
                right -= 1
            
            if left < right:
                s_list[left], s_list[right] = s_list[right], s_list[left]
                left += 1
                right -= 1
        
        return ''.join(s_list)

if __name__ == "__main__":
    solution = Solution()
    input_str = "hello"
    output_str = solution.reverseVowels(input_str)
    print(f"Input: {input_str}")
    print(f"Output: {output_str}")