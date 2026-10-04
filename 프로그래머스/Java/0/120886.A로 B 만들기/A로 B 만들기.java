class Solution
{
    public int solution(String before, String after)
    {
        int[] alps_before = new int['z' - 'a' + 1];
        int[] alps_after = new int['z' - 'a' + 1];
        
        int len = before.length();
        
        for(int i = 0; i < len; i++)
        {
            alps_before[before.charAt(i) - 'a']++;
            alps_after[after.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < alps_before.length; i++)
            if(alps_before[i] != alps_after[i])
                return 0;
        
        return 1;
    }
}