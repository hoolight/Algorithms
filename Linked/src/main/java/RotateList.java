import LinkedModel.ListNode;

/**
 * 旋转链表
 */
public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (k==0||head==null||head.next==null){
            return head;
        }
        int n=0;
        ListNode it=head;
        while (it!=null){
            it=it.next;
            n++;
        }
        k=k%n;
        ListNode slow=head;
        ListNode fast=head;
        for (int i = 0; i < k; i++) {
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next=head;
        fast=slow.next;
        slow.next=null;
        return fast;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5,new ListNode(6))))));
        System.out.println(RotateList.rotateRight(l1,2));
    }
}
