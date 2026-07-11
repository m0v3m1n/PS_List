class Solution
{
    public String solution(String my_string)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++)
        {
            if('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z')
                S.append((char)(my_string.charAt(i) + ('a' - 'A')));
            else
                S.append((char)(my_string.charAt(i) - ('a' - 'A')));
        }
        
        String answer = S.toString();
        return answer;
    }
}