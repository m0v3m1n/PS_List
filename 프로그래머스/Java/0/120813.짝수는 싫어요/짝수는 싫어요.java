class Solution
{
    public int[] solution(int n)
    {
        int len = (n / 2) + (n % 2);
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++)
            answer[i] = 1 + (i * 2);
        
        return answer;
    }
}