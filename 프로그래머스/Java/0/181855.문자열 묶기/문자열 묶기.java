import java.util.*;

class Solution
{
    public int solution(String[] strArr)
    {
        int max = 0;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < strArr.length; i++)
            if(h.containsKey(strArr[i].length()))
                h.put(strArr[i].length(), h.get(strArr[i].length()) + 1);
            else
                h.put(strArr[i].length(), 1);
        
        for(int e : h.values())
            if(e > max)
                max = e;
        
        return max;
    }
}