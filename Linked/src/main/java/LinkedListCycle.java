import LinkedModel.ListNode;

/**
 *环形链表
 */
public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        if (head==null||head.next==null)return false;
        ListNode slow=head,fast=head.next;
        while (slow!=fast){
            if (fast.next==null||fast.next.next==null)return false;
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode l3=new ListNode(2);
        ListNode l2=new ListNode(3,new ListNode(4,new ListNode(5,l3)));
        l3.next=l2;
        ListNode l1=new ListNode(1,l3);
        System.out.println(LinkedListCycle.hasCycle(l1));
    }
}
