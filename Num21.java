package LeetCode;

public class Num21 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode(0,null);
        ListNode index=head;
        while(list1!=null&&list2!=null){
            if(list1.val< list2.val){
                ListNode newNode=new ListNode(list1.val,null);
                index.next=newNode;
                index=newNode;
                list1=list1.next;
            }if(list2.val<= list1.val){
                ListNode newNode=new ListNode(list2.val,null);
                index.next=newNode;
                index=newNode;
                list2=list2.next;
            }
        }
        while(list1!=null){
            ListNode newNode=new ListNode(list1.val,null);
            index.next=newNode;
            index=newNode;
            list1=list1.next;
        }
        while(list2!=null){
            ListNode newNode=new ListNode(list2.val,null);
            index.next=newNode;
            index=newNode;
            list2=list2.next;
        }
        return head.next;
    }
}
