class Solution
{
    public int solution(int[] sides)
    {
        int max = 0, sum = 0
            ;
        for(int i = 0; i < 3; i++)
        {
            sum += sides[i];
            
            if(sides[i] > max)
                max = sides[i];
        }
        
        int answer = (sum - max > max) ? 1 : 2;
        return answer;
    }
}