class Solution
{
    public int solution(int n)
    {
        int answer = ((n % 7 != 0) ? 1 : 0) + (n / 7);
        return answer;
    }
}