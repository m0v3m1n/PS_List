class Solution
{
    public String solution(String my_string, String letter)
    {
        StringBuilder S = new StringBuilder();
        for(int i = 0; i < my_string.length(); i++)
            if(my_string.charAt(i) != letter.charAt(0))
               S.append(my_string.charAt(i));
        
        String answer = S.toString();
        return answer;
    }
}