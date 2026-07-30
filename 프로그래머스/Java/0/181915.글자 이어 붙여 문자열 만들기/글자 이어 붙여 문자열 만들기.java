class Solution
{
    public String solution(String my_string, int[] index_list)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < index_list.length; i++)
            S.append(my_string.charAt(index_list[i]));
        
        String answer = S.toString();
        return answer;
    }
}