import java.util.*;

class Solution
{
    public int[] solution(int[] arr, boolean[] flag)
    {
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < flag.length; i++)
        {
            if(flag[i] == true)
                for(int j = 0; j < arr[i] * 2; j++)
                    L.add(arr[i]);
            else
                L = L.subList(0, L.size() - arr[i]);
        }
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < L.size(); i++)
            answer[i] = L.get(i).intValue();
        
        return answer;
    }
}