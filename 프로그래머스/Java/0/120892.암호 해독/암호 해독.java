class Solution
{
    public String solution(String cipher, int code)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < cipher.length(); i++)
            if((i + 1) % code == 0)
                S.append(cipher.charAt(i));
        
        return S.toString();
    }
}