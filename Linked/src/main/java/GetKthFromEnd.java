import LinkedModel.ListNode;

/**
 *  链表中倒数第k个节点
 */
public class GetKthFromEnd {
    public static ListNode getKthFromEnd(ListNode head, int k) {
//        ListNode slow=head;
        ListNode fast=head;
        for (int i = 0; i < k; i++) {
            if (fast==null)
                throw new IllegalArgumentException("this k no solution");
            fast=fast.next;
        }
        while (fast!=null){
            head=head.next;
            fast=fast.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6))))));
        System.out.println(GetKthFromEnd.getKthFromEnd(l1,6));
    }
}
