import LinkedModel.ListNode;

/**
 * 分隔链表
 */
public class PartitionList {
    public static ListNode partition(ListNode head, int x) {
        ListNode l1=new ListNode(0);
        ListNode l2=new ListNode(0);
        ListNode l1Head=l1;
        ListNode l2Head=l2;
        while (head!=null){
            if (head.val<x){
                l1.next=head;
                l1=l1.next;
            }else {
                l2.next=head;
                l2=l2.next;
            }
            head=head.next;
        }
        l2.next=null;
        l1.next=l2Head.next;
        return l1Head.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(4,new ListNode(3,new ListNode(2,new ListNode(5,new ListNode(2))))));
        System.out.println(PartitionList.partition(l1,3));
    }
}
