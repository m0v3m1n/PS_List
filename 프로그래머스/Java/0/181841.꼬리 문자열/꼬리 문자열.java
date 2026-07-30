class Solution
{
    public String solution(String[] str_list, String ex) 
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < str_list.length; i++)
        {
            boolean flag = true;
            
            for(int j = 0; j <= str_list[i].length() - ex.length(); j++)
                if(ex.equals(str_list[i].substring(j, j + ex.length())))
                {
                    flag = false;
                    break;
                }
            
            if(flag)
                S.append(str_list[i]);
        }
        
        String answer = S.toString();
        return answer;
    }
}