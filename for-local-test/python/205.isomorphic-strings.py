class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        s_to_t = {}
        t_to_s = {}
        for cs, ct in zip(s, t):
            if(cs in s_to_t and s_to_t[cs] != ct):
                return False
            if(ct in t_to_s and t_to_s[ct] != cs):
                return False
            s_to_t[cs] = ct
            t_to_s[ct] = cs
        return True
    
if __name__ == "__main__":
    solution = Solution()
    print(solution.isIsomorphic("egg", "add")) # true
    print(solution.isIsomorphic("foo", "bar")) # false
    print(solution.isIsomorphic("paper", "title")) # true