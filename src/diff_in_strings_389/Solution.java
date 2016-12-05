package diff_in_strings_389;

public class Solution {
	 public char findTheDifference1(String s, String t) 
	    {
	          
	          char res = 0;
	          int i=1,j=0;
	          while(i<s.length())
	          {
	              res  = (char) (res^s.charAt(i)); 
	              i++;
	          }
	          while(j<t.length())
	          {
	              res ^=t.charAt(j); 
	              j++;
	          }
	          
	          return res;
	    }
    public char findTheDifference(String s, String t) 
    {
          char diff = ' ';
          int []res = new int[26];
          for(int i=0;i<t.length();i++)
          {
                res[t.charAt(i)-'a']++;
          }
          for(int i=0;i<s.length();i++)
          {
                res[s.charAt(i)-'a']--;
          }
          for(int i=0;i<26;i++)
          {
                if(res[i]>0)
                {
                   diff=  (char)(i+97);
                }
          }
          return diff;
    }
}