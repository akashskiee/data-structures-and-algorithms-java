//https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/

public class ConvertBinaryNumber {
    public static void main(String[] args) {
        
        
        ListNode two = new ListNode(1);
        ListNode one = new ListNode(0, two);
        ListNode head = new ListNode(1, one);

        System.out.println(getDecimalValue(head));
    }

    

    public static int getDecimalValue(ListNode head) {
        ListNode hasNext = head;
        int [] arr = new int[30];
        int i = 0;
        while(hasNext != null){
            arr[i] = hasNext.val;
            i++;
            hasNext = hasNext.next;
        }
        
        
        return getValue(arr,i);
    }
    
    public static int getValue(int arr[], int n){
        int sum = 0;
        for(int i = 0, j= 1; i < n; i++, j++){
            sum += arr[i] * Math.pow(2, n - j);
        }
        return sum;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}