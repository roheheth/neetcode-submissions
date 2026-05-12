/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //create a temp variable to find out the length of the linked list;

        int length = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            length++;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        temp = dummy;
        for(int i = 0; i<length-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return dummy.next;
    }
}
