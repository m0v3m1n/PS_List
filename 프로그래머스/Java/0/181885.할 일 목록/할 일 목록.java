import java.util.*;

class Solution
{
    public String[] solution(String[] todo_list, boolean[] finished)
    {
        List<String> L = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++)
            if(finished[i] == false)
                L.add(todo_list[i]);
        
        return L.toArray(new String[0]);
    }
}