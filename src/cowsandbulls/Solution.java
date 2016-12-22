package cowsandbulls;

public class Solution {
    
public String getHint(String secret,String guess)
{
   int [] s = new int[10];
   int [] g = new int[10];
   int b = 0,c=0;
   for(int i=0;i<secret.length();i++)
   {
       if(secret.charAt(i)==guess.charAt(i))
       {
           b++;
       }
       else
       {
           s[Character.getNumericValue(secret.charAt(i))]++;
           g[Character.getNumericValue(guess.charAt(i))]++;
       }
   }
   for(int i=0;i<s.length;i++)
   {
       c+=Math.min(s[i],g[i]);
   }
   return new StringBuilder().append(b).append('A').append(c).append('B').toString();
   
}
}
