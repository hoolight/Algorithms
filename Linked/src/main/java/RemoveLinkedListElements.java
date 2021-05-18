import LinkedModel.ListNode;

/**
 * 移除链表元素
 */
public class RemoveLinkedListElements {
    public static ListNode removeElements(ListNode head, int val) {
//        if (head==null)
//            return null;
//        head.next=removeElements(head.next,val);
//        if (head.val==val){
//            return head.next;
//        }else {
//            return head;
//        }
        ListNode sentinel = new ListNode(0,head);
        ListNode prev=sentinel,curr=head;
        while (curr!=null){
            if (curr.val==val){
                prev.next=curr.next;
            }else {
                prev=curr;
            }
            curr=curr.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        ListNode l=new ListNode(1,new ListNode(2,new ListNode(6,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6)))))));
//        ListNode l=new ListNode(6);
        System.out.println(RemoveLinkedListElements.removeElements(l, 6).toString());
    }
}
