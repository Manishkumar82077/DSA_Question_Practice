public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummyHead = new ListNode(-101);
        ListNode dummyPointer = dummyHead;
        
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                dummyHead.next = list1;
                list1 = list1.next;
                dummyHead = dummyHead.next;
            }
            else{
                dummyHead.next = list2;
                list2 = list2.next;
                dummyHead = dummyHead.next;
            }   
        }
        
        if(list1 != null){
            dummyHead.next = list1;
        }
        else if(list2 != null){
            dummyHead.next = list2;
        }
        
            return dummyPointer.next;
    }
        
}
