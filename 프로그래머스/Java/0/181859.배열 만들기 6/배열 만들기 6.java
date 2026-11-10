import java.util.*;

class Solution
{
    public int[] solution(int[] arr)
    {
        int i = 0;
        List<Integer> L = new ArrayList<>();
        
        while(true)
        {
            if(i >= arr.length)
                break;
            
            if(L.isEmpty())
                L.add(arr[i]);
            else if(L.get(L.size() - 1) == arr[i])
                L.remove(L.size() - 1);
            else
                L.add(arr[i]);
            
            i++;
        }
        
        if(L.isEmpty())
            return new int[]{-1};
        else
        {
            int[] answer = new int[L.size()];
            
            for(int j = 0; j < L.size(); j++)
                answer[j] = L.get(j);
            
            return answer;
        }
    }
}