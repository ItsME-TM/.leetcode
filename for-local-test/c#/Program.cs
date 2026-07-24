// 434.number-of-segments-in-a-string
using c_.Solutions;

class Program
{
    static void Main(string[] args)
    {
        string s = "Hello, my name is John";
        int result = Solution.CountSegments(s);
        Console.WriteLine("Number of segments: " + result); // Output: Number of segments: 5
    }
}