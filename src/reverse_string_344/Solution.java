package reverse_string_344;

public class Solution {
    public String reverseString(String s) {
        char[] array = s.toCharArray();
        int l = 0,r=s.length()-1;
        while(l<r)
        {
            char temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;r--;
        }
        return new String(array);
    }
}
