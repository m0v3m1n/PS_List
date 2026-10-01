class Solution
{
    public String solution(String my_string, int s, int e)
    {
        StringBuilder S = new StringBuilder();
        
        S.append(my_string.substring(0, s));
        S.append(new StringBuilder(my_string.substring(s, e + 1)).reverse().toString());
        S.append(my_string.substring(e + 1, my_string.length()));
        
        return S.toString();
    }
}