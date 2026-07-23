import java.util.*;

class Solution
{
    public int[] solution(int[] num_list, int n)
    {
        List<Integer> IL = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i += n)
            IL.add(num_list[i]);
        
        int[] answer = new int[IL.size()];
        for(int i = 0; i < answer.length; i++)
            answer[i] = IL.get(i).intValue();
        
        return answer;
    }
}