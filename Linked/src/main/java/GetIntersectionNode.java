import LinkedModel.ListNode;

/**
 * 两个链表的第一个公共节点
 */
public class GetIntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode la=headA,lb=headB;
        while (la!=lb){
            la=la!=null?la.next:headB;
            lb=lb!=null?lb.next:headA;
        }
        return la;
    }

    public static void main(String[] args) {
        ListNode l0=new ListNode(4,new ListNode(5,new ListNode(6)));
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,l0)));
        ListNode l2=new ListNode(1,new ListNode(2,l0));
        System.out.println(GetIntersectionNode.getIntersectionNode(l1,l2));
    }
}
