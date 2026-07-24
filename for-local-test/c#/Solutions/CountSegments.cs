using System;

namespace c_.Solutions
{
    public class Solution
    {
        public static int CountSegments(string s)
        {
            s = s.Trim();
            if (string.IsNullOrEmpty(s))
            {
                return 0;
            }
            int count = 0;
            for (int i = 0; i < s.Length; i++)
            {
                if (s[i] == ' ')
                {
                    count++;
                    while (i < s.Length && s[i] == ' ')
                    {
                        i++;
                    }
                }
            }
            return count + 1;
        }
    }
}