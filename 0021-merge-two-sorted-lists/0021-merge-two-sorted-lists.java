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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1, p2 = list2;
        ListNode ans = new ListNode();
        ListNode temp = ans;

        if(p1 == null) return p2;
        if(p2 == null) return p1;

        while(p1 != null && p2 != null) {
            if(p1.val < p2.val) {
                temp.next = p1;
                p1 = p1.next;
                temp = temp.next;
            }
            else {
                temp.next = p2;
                p2 = p2.next;
                temp = temp.next;
            }
        } 

        if(p1 != null) {
            temp.next = p1;
        }
        if(p2 != null) {
            temp.next = p2;
        }
        return ans.next;
    }
}