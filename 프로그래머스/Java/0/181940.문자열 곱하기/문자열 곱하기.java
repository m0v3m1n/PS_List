class Solution
{
    public String solution(String my_string, int k)
    {
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < k; i++)
            S.append(my_string);
        
        String answer = S.toString();
        return answer;
    }
}