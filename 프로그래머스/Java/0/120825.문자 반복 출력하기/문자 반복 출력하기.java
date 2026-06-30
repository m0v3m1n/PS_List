class Solution
{
    public String solution(String my_string, int n)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++)
            for(int j = 0; j < n; j++)
                S.append(my_string.charAt(i));
        
        String answer = S.toString();
        return answer;
    }
}