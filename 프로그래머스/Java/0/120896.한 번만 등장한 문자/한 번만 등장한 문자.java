class Solution
{
    public String solution(String s)
    {
        StringBuilder S = new StringBuilder();
        
        int[] alp = new int['z' - 'a' + 1];
        for(char c : s.toCharArray())
            alp[c - 'a']++;
        
        for(int i = 0; i < alp.length; i++)
            if(alp[i] == 1)
                S.append((char)('a' + i));
            
        return S.toString();
    }
}