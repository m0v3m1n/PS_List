class Solution
{
    public String solution(String rsp)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 0; i < rsp.length(); i++)
            if(rsp.charAt(i) == '2')
                S.append("0");
            else if(rsp.charAt(i) == '0')
                S.append("5");
            else
                S.append("2");
        
        String answer = S.toString();
        return answer;
    }
}