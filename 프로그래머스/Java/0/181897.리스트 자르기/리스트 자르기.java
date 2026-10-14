import java.util.*;

class Solution
{
    public int[] solution(int n, int[] slicer, int[] num_list)
    {
        List<Integer> L = new ArrayList<>();
        
        if(n == 1)
            for(int i = 0; i < slicer[1] + 1; i++)
                L.add(num_list[i]);
        else if(n == 2)
            for(int i = slicer[0]; i < num_list.length; i++)
                L.add(num_list[i]);
        else if(n == 3)
            for(int i = slicer[0]; i < slicer[1] + 1; i++)
                L.add(num_list[i]);
        else if(n == 4)
            for(int i = slicer[0]; i < slicer[1] + 1; i += slicer[2])
                L.add(num_list[i]);
        
        int[] answer = new int[L.size()];
        for(int i = 0; i < L.size(); i++)
            answer[i] = L.get(i);
        
        return answer;
    }
}