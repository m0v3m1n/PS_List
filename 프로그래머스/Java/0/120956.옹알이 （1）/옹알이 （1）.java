class Solution
{
    public int solution(String[] babbling)
    {
        int count = 0;
        String[] joka = {"aya", "ye", "woo", "ma"}; // 순환용
        
        for(String s : babbling) // 모든 문자열 탐색
        {
            boolean flag = true;
            
            while(flag == true)
            {
                flag = false; // flag를 0으로 만든 뒤
                
                for(String j : joka)
                    if(s.startsWith(j)) // 만약 찾으면 flag를 1로 변경 / substring / count 추가
                    {
                        s = s.substring(j.length());
                        flag = true;
                    } // joka 문자열 4개 다 찾기, 만약 4개 다 없으면 나가리
            }
            
            if(s.length() > 0)
                continue;
            else
                count++;
        }
        
        return count;
    }
}