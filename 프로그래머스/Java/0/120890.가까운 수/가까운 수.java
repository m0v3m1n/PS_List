import java.util.*;

class Solution
{
    public int solution(int[] array, int n)
    {
        int min_diff = 10000, num = 0;
        Arrays.sort(array);
        
        for(int i = 0; i < array.length; i++)
        {
            int diff = Math.abs(array[i] - n);
            
            if(diff < min_diff)
            {
                num = array[i];
                min_diff = diff;
            }
        }
        
        return num;
    }
}