class Solution
{
    public int solution(int num, int k)
    {
        int answer = -1;
        int count = 0;
        
        while(num > 0)
        {
            count++;
            
            if(num % 10 == k)
                answer = count;
                
            num /= 10;
        }
        
        return answer == -1 ? -1 : count - answer + 1;
    }
}