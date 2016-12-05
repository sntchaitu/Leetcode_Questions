package add_numers_without_operator_371;

public class Solution {

	
	
	public  int addIterative(int a, int b){  
	    while (b != 0){
	        int carry = (a & b) ; //CARRY is AND of two bits
	      
	        a = a ^b; //SUM of two bits is A XOR B
	      
	        b = carry << 1; //shifts carry to 1 bit to calculate sum
	    }
	    return a;
	}
	
	public static void main(String args[])
	{
		Solution s1 = new Solution();
		System.out.println(s1.addIterative(2, 3));
	}
}




