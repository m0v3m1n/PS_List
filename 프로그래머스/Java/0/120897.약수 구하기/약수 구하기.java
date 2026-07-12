import java.util.*;

class Solution
{
    public int[] solution(int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n / 2; i++)
            if(n % i == 0)
                list.add(i);

        int[] answer = new int[list.size() + 1];
        for(int i = 0; i < list.size(); i++)
            answer[i] = list.get(i).intValue();
        answer[list.size()] = n;
        
        return answer;
    }
}