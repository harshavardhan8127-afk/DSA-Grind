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
    public int getDecimalValue(ListNode head) {

        int[] res = new int[30];
        int id = 0;
        ListNode temp = head;

        if(head==null) return 0;


        while(temp!=null){
          res[id] = temp.val;
          id++;
          temp = temp.next;
        }

        int sum = 0;
        for(int i=0;i<id;i++){
            sum = sum * 2 + res[i];
        }

        return sum;
        
    }
}