import LinkedModel.ListNode;

/**
 * 反转链表
 */
public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
//        ListNode prev=null,curr=head;
//        while (curr!=null){
//            ListNode next=curr.next;
//            curr.next=prev;
//            prev=curr;
//            curr=next;
//        }
//        return prev;
        if (head==null||head.next==null)return head;
        ListNode curr=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return curr;
    }
    public static void main(String[] args) {
//        ListNode l=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        ListNode l=new ListNode(1,new ListNode(2));
        System.out.println(ReverseLinkedList.reverseList(l).toString());
//        l.next.next=l;
//        l.next=null;
//        System.out.println(l);
    }
}
