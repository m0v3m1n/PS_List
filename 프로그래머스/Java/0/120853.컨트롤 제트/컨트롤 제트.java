import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int sum = 0;
        String[] S = s.split(" ");
        
        for(int i = 0; i < S.length; i++)
        {
            if(S[i].equals("Z"))
                sum -= Integer.parseInt(S[i - 1]);
            else
                sum += Integer.parseInt(S[i]);
        }
        
        return sum;
    }
}