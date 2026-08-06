import java.util.*;

class Solution
{
    public int[] solution(int[] arr, int[] delete_list)
    {
        Arrays.sort(delete_list);
        
        List<Integer> L = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++)
            if(Arrays.binarySearch(delete_list, arr[i]) < 0) // 삭제 목록에 없다면
                L.add(arr[i]); // 리스트에 추가
        
        return L.stream().mapToInt(i -> i).toArray();
    }
}