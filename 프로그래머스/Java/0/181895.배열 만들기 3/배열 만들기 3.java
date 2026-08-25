import java.util.*;

class Solution
{
    public int[] solution(int[] arr, int[][] intervals)
    {
        int[] range1 = Arrays.copyOfRange(arr, intervals[0][0], intervals[0][1] + 1);
        int[] range2 = Arrays.copyOfRange(arr, intervals[1][0], intervals[1][1] + 1);
        
        int[] res = new int[range1.length + range2.length];
        
        for(int i = 0; i < range1.length; i++)
            res[i] = range1[i];
        for(int i = 0; i < range2.length; i++)
            res[i + range1.length] = range2[i];
        
        return res;
    }
}