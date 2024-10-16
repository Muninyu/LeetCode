import java.util.LinkedList;
import java.util.List;

public class problem206 {
    public static void main(String[] args){
        ListNode head = new ListNode(5);
        head = new ListNode(4, head);
        head = new ListNode(3, head);
        head = new ListNode(2, head);
        head = new ListNode(1, head);
        System.out.println(reverseList(head).val);
    }
    public static ListNode reverseList(ListNode head){
        ListNode reverse = null;
        while(head != null){
            reverse = new ListNode(head.val, reverse);
            head = head.next;
        }
        return  reverse;
    }
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
