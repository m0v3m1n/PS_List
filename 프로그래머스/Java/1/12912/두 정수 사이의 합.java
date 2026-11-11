class Solution
{
    public long solution(int a, int b)
    {
        long n = a < b ? a : b;
        long m = a > b ? a : b;
        
        long answer = (n + m) * (m - n + 1) / 2;
        return answer;
    }
}