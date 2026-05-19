class Solution {
    public void reorderList(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int[] arr = new int[length];
        temp = head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.val;
            temp = temp.next;
        }
        int c = 0;
        int[] arr1 = new int[length];
        for(int i = 0; i<length; i++){
            if(i%2 != 0){
                arr1[i] = arr[length-c];
            }else{
                arr1[i] = arr[c];
                c++;
            }
        }
        temp = head;
        int ind = 0;
        while(temp != null){
            temp.val = arr1[ind];
            temp = temp.next;
            ind++;
        }
    }
}