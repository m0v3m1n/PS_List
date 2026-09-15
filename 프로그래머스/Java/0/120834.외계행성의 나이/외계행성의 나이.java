class Solution
{
    public String solution(int age)
    {
        StringBuilder S = new StringBuilder();
        
        while(true)
        {
            if(age == 0)
                break;
            
            S.append((char)((age % 10) + 'a'));
            age /= 10;
        }
        
        S.reverse();
        return S.toString();
    }
}