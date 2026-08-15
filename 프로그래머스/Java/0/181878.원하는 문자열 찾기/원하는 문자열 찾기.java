class Solution
{
    public int solution(String myString, String pat)
    {
        for(int i = 0; i <= myString.length() - pat.length(); i++)
                if(myString.substring(i, i + pat.length()).toLowerCase().equals(pat.toLowerCase()))
                    return 1;
        return 0;
    }
}