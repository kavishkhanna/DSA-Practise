package LinkedList;

public class RemoveNthNodeFromLast {

    public static void main(String[] args){
        ListNode entry = new ListNode(1);
        entry.next = new ListNode(2);
        entry.next.next = new ListNode(3);
        entry.next.next.next = new ListNode(4);
        entry.next.next.next.next = new ListNode(5);
        RemoveNthNodeFromLast rm = new RemoveNthNodeFromLast();
        System.out.println(rm.removeNthFromEnd(entry, 2));
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0 ; i < n; n++){
            fast = fast.next;
        }
        if(fast == null){
            return head.next;
        }
        while(fast.next!= null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;


    }



}
