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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode temp = head;

        while(temp.next != null){
            int ins = GCD(temp.val,temp.next.val);
            ListNode node = new ListNode(ins);
            node.next = temp.next;
            temp.next = node;

            temp = temp.next.next;
        }
        return head;
    }
    public int GCD(int x,int y){
        while(y!=0){
            int temp = y;
            y = x%y;
            x = temp;
        }
        return x;
    }
}