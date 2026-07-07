package LinkedList;

public class Rearrange {

    public static void main(String[] args){
        ListNode entry = new ListNode(1);
        entry.next = new ListNode(2);
        entry.next.next = new ListNode(3);
        entry.next.next.next = new ListNode(4);
        entry.next.next.next.next = new ListNode(5);
        Rearrange rm = new Rearrange();
        rm.reorderList(entry);

    }

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!= null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = slow.next; // 4 - 5 - 6
        while(reverse.next != null){
            ListNode temp = reverse.next; // 5 - 6
            slow.next = temp; // 3 5 6
            reverse.next = temp.next; //4 - 6


        }



    }
}
