class Solution
{
    public int solution(int[] array, int n)
    {
        int answer = 0;
        
        for(int v : array)
            answer = v == n ? answer + 1 : answer;
        
        return answer;
    }
}