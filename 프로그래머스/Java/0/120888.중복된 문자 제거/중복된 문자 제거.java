class Solution
{
    public String solution(String my_string)
    {
        StringBuilder S = new StringBuilder();
        
        S.append(my_string.charAt(0));
        
        for(int i = 1; i < my_string.length(); i++)
            if(my_string.substring(0, i).contains(String.valueOf(my_string.charAt(i))))
                continue;
            else
                S.append(my_string.charAt(i));
        
        return S.toString();
    }
}