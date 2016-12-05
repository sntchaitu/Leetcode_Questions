package assign_cookies;

import java.util.*;

public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int count =0;
        for(int i=0,j=0;i<g.length&&j<s.length;j++)
        {
            if(s[j]>=g[i])
            {
                count++;
                i++;
            }
           
        }
        return count;
    }
}