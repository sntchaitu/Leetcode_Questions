package repeated_substring_pattern;

public class Solution {
    int[] kmp(String str)
    {
        
        int[] prefix = new int[str.length()];
        int j=0,i=1;
        while(i<str.length())
        {
            if(str.charAt(i)==str.charAt(j))
            {
                
               
                prefix[i] = j+1;
                 j++;i++;
            }
            else
            {
                if(j>0)
                {
                    j = prefix[j-1];
                }
                else
                {
                    prefix[i] = 0;
                    i++;
                }
            }
        }
        return prefix;
    }
    
    public boolean repeatedSubstringPattern(String str) {
        if(str==null||str.length()==0)
        {
            return false;
        }
        int prefix[] = kmp(str);
        return prefix[prefix.length-1]==0?false:(str.length()%(str.length()-prefix[prefix.length-1])==0);
        
    }
}
