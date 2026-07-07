package LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args){
        ListNode entry = new ListNode(1);
        entry.next = new ListNode(2);
        entry.next.next = new ListNode(3);
        entry.next.next.next = new ListNode(4);
        entry.next.next.next.next = new ListNode(5);

    }


    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode newHead = null;
        while(head.next != null){
            temp = head.next; //3 - 4 - 5
            head.next = temp.next;
            // 2 - 1 - 1
            temp.next = head;
            newHead = temp;
        }
        return newHead;
    }
}
