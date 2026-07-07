class Solution
{
    public int solution(int[] numbers)
    {
        int max_1 = 0, max_2 = 0;
        
        for(int i = 0; i < numbers.length; i++)
            for(int j = 0; j < numbers.length - i - 1; j++)
            {
                int tmp = numbers[j];
                
                if(numbers[j] > numbers[j + 1])
                {
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        
        int answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
        return answer;
    }
}