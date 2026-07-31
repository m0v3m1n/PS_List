import java.util.*;

class Solution
{
    public int[] solution(int[] arr)
    {
        List<Integer> L = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i]; j++)
                L.add(arr[i]);
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < L.size(); i++)
            answer[i] = L.get(i).intValue();
        
        return answer;
    }
}