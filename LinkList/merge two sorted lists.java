class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null) return null;

        ListNode t1=list1;
        ListNode t2=list2;
        ListNode temp=new ListNode(-1);
        ListNode curr=temp;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                ListNode newnode =new ListNode(t1.val);
                curr.next=newnode;
                curr=newnode;
                t1=t1.next;
            }
            else{
                ListNode newnode=new ListNode(t2.val);
                curr.next=newnode;
                curr=newnode;
                t2=t2.next;
            }
        }
        while(t1!=null){
            ListNode newnode=new ListNode(t1.val);
            curr.next=newnode;
            curr=newnode;
            t1=t1.next;
        }
        while(t2!=null){
            ListNode newnode=new ListNode(t2.val);
            curr.next=newnode;
            curr=newnode;
            t2=t2.next;
        }
        return temp.next;


        
    }
}
