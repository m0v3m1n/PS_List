class Solution
{
    public String solution(String[] arr)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++)
            S.append(arr[i]);
        
        String answer = S.toString();
        return answer;
    }
}