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
        if(head == null) return null;
        ListNode temp = head;
        int length = 0;
        while(temp != null) {
            length ++;
            temp = temp.next;
        }
        if(length == n) {
            return head.next;
        }
        length = length - n;
        temp = head;
        while(temp != null){
            length--;
            if(length==0) break;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}