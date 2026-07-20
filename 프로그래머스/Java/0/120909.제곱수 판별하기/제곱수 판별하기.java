class Solution
{
    public int solution(int n)
    {
        int answer = 0;
        
        if((int)Math.sqrt(n) * (int)Math.sqrt(n) == n)
            answer = 1;
        else
            answer = 2;
        
        return answer;
    }
}