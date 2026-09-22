import java.util.*;

class Solution
{
    public int[] solution(String[] intStrs, int k, int s, int l)
    {
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < intStrs.length; i++)
        {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));
            
            if(num > k)
                L.add(num);
        }
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = L.get(i);
        
        return answer;
    }
}