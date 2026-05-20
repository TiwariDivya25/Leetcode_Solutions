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
    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = p1.next;
        while(p2 != null) {
            int gcd = gcd(p1.val, p2.val);
            ListNode node = new ListNode(gcd);
            node.next = p2;
            p1.next = node;
            p1 = p2;
            p2 = p2.next;
        } 
        return head;
    }
}