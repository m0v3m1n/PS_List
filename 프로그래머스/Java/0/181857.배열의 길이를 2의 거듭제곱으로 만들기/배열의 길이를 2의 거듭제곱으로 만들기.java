class Solution
{
    public int[] solution(int[] arr)
    {
        int s = arr.length;
        int cs = 1;
        
        while(s > cs)
            cs *= 2;
        
        int[] answer = new int[cs];
        for(int i = 0; i < s; i++)
            answer[i] = arr[i];
        
        return answer;
    }
}