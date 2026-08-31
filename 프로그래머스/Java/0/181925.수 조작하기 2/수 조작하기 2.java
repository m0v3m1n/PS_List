class Solution
{
    public String solution(int[] numLog)
    {
        StringBuilder S = new StringBuilder();
        
        for(int i = 1; i < numLog.length; i++)
            if(numLog[i] - numLog[i - 1] == 1)
                S.append("w");
            else if(numLog[i] - numLog[i - 1] == -1)
                S.append("s");
            else if(numLog[i] - numLog[i - 1] == 10)
                S.append("d");
            else if(numLog[i] - numLog[i - 1] == -10)
                S.append("a");
        
        return S.toString();
    }
}