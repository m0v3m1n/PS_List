import java.util.*;

class Solution
{
    public int solution(int[] array)
    {
        Arrays.sort(array);
        return array[(array.length / 2 - (array.length % 2 == 0 ? 1 : 0))];
    }
}