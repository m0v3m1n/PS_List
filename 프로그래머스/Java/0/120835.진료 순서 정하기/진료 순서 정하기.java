import java.util.*;

class Solution
{
    public int[] solution(int[] emergency)
    {
        int[] copy = Arrays.copyOf(emergency, emergency.length); // 3, 76, 24
        Arrays.sort(emergency); // 3, 24, 76
        
        for(int i = 0; i < emergency.length; i++)
            copy[i] = emergency.length - Arrays.binarySearch(emergency, copy[i]);
        
        return copy;
    }
}