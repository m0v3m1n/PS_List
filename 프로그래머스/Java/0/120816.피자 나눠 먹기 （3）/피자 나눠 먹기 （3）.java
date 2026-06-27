class Solution
{
    public int solution(int slice, int n)
    {
        int answer = ((n % slice != 0) ? 1 : 0) + n / slice;
        return answer;
    }
}