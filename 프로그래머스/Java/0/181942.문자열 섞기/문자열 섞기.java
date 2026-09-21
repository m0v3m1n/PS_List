class Solution
{
    public String solution(String str1, String str2)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < str1.length(); i++)
        {
            S.append(str1.charAt(i));
            S.append(str2.charAt(i));
        }
        
        return S.toString();
    }
}