import LinkedModel.ListNode;

/**
 * 合并两个有序链表
 */
public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null)return l2;
        else if (l2==null)return l1;
        else if (l1.val< l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1,new ListNode(2,new ListNode(4)));
        ListNode l2=new ListNode(1,new ListNode(3,new ListNode(4)));
        System.out.println(MergeTwoSortedLists.mergeTwoLists(l1, l2).toString());
    }
}
