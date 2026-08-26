import java.util.*;

class Solution
{
    public int[] solution(int n)
    {
        List<Integer> L = new ArrayList<>();
        
        while(true)
        {
            L.add(n);
            
            if(n == 1)
                break;
            else if(n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < L.size(); i++)
            answer[i] = L.get(i).intValue();
        
        return answer;
    }
}