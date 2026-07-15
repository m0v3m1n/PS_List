import java.util.*;

class Solution
{
    public int[] solution(int n, int[] numlist)
    {
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < numlist.length; i++)
            if(numlist[i] % n == 0)
                L.add(numlist[i]);
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < L.size(); i++)
            answer[i] = L.get(i).intValue();
            
        return answer;
    }
}