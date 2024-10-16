public class problem023 {
    public static void main(String[] args){
        ListNode listNode1 = new ListNode(5);
        listNode1 = new ListNode(4, listNode1);
        listNode1 = new ListNode(1, listNode1);
        ListNode listNode2 = new ListNode(4);
        listNode2 = new ListNode(3, listNode2);
        listNode2 = new ListNode(1, listNode2);
        ListNode listNode3 = new ListNode(6);
        listNode3 = new ListNode(2, listNode3);
        ListNode[] lists = {listNode1, listNode2, listNode3};
        System.out.println(mergeKList(lists).val);

    }
    public static ListNode mergeKList(ListNode[] lists){
        int listsNums = 0;
        for(ListNode listNode : lists){
            if(listNode != null){
                listsNums++;
            }
        }
        ListNode inverseAns = null;
        if(lists == null || lists.length == 0){
            return null;
        }
        while(listsNums != 0){
            int minNum = 0;
            while(lists[minNum] == null){
                minNum++;
                if(minNum == lists.length){
                    return null;
                }
            }
            int minVal = lists[minNum].val;
            for(int i = 1; i < lists.length; i++){
                if(lists[i] == null) continue;
                if (lists[i].val < minVal){
                    minNum = i;
                    minVal = lists[i].val;
                }
            }
            inverseAns = new ListNode(minVal, inverseAns);
            if(lists[minNum].next != null){
                lists[minNum] = lists[minNum].next;
            } else {
                lists[minNum] = lists[minNum].next;
                listsNums--;
            }
        }
        if(inverseAns == null) return null;
        ListNode ans = new ListNode(inverseAns.val);
        while(inverseAns.next != null){
            inverseAns = inverseAns.next;
            ans = new ListNode(inverseAns.val, ans);
        }
        return ans;
    }
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
