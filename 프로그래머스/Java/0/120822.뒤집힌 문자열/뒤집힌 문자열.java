class Solution
{
    public String solution(String my_string)
    {
        StringBuilder S = new StringBuilder();
        for(int i = my_string.length() - 1; i >= 0; i--)
            S.append(my_string.charAt(i));
        
        String answer = S.toString();
        return answer;
    }
}