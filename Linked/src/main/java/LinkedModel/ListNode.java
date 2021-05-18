package LinkedModel;

/**
 * 链表模型
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        if (this==null){
            return "";
        }
        String nextVal="";
        if (this.next!=null){
            nextVal=this.next.toString();
        }
        return this.val+","+nextVal;
    }
}
