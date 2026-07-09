class Solution
{
    public String solution(String my_string)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < my_string.length(); i++)
        {
            char c = my_string.charAt(i);
            
            if(c == 'a' || c == 'e' ||c == 'i' ||c == 'o' || c == 'u')
                continue;
            else
                S.append(c);
        }
        
        String answer = S.toString();
        return answer;
    }
}