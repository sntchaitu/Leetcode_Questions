package Plus_One_Linked_List_369;



 class ListNode {
	     int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

public class Solution {
    
    static ListNode reverse(ListNode head)
    {
        ListNode dummy = new ListNode(-1);
        ListNode preMid = dummy,preCurrent = head;
        dummy.next = head;
        while(preCurrent.next!=null)
        {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMid.next;
            preMid.next = current;
        }
        return dummy.next;
    }
    
    static ListNode addNumber(ListNode head,int num)
    {
        int sum =num;
        ListNode dummy = new ListNode(-1),temp=dummy;
        while(temp.next!=null)
        {
           
            sum = sum+temp.next.val;
            temp.next.val = sum%10;
            sum = sum/10;
            temp = temp.next;
        }
        if(sum/10==1)
        {
            temp.next = new ListNode(1);
        }
        return dummy.next;
    }
    
    public static ListNode plusOne(ListNode head) {
        if(head==null)
        {
            return head;
        }
         head = reverse(head);
         head = addNumber(head,1);
         head = reverse(head);
         return head;
    }
    
    public static void main(String args[])
    {
    	ListNode head = new ListNode(1);
    	head.next = new ListNode(2);
    	head.next.next = new ListNode(3);
    	plusOne(head);
    	System.out.println();
    }
}
