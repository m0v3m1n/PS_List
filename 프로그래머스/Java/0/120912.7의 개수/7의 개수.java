import java.util.*;

class Solution
{
    public int solution(int[] array)
    {
        int answer = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            String S = Integer.toString(array[i]);
            answer += (S.length() - S.replaceAll("7", "").length());
        }
        
        return answer;
    }
}