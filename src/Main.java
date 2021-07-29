public class Main {
    public static void main(String[] args) {
        var l1 = new ListNode();
        l1.val = 1;
        ListNode prev = l1;

        for (int i = 2; i < 5; i++) {
            ListNode tmp = new ListNode();
            tmp.val = i;
            prev.next = tmp;
            prev = tmp;
        }
        ListNode pointer = l1;
        while (pointer != null) {
            System.out.println(pointer.val);
            pointer = pointer.next;
        }
        System.out.println(prev.val + "--------------");

        ListNode reversedPart = null;
        ListNode current = l1;
        while (current != null) {
            ListNode next = current.next;
            current.next = reversedPart;
            reversedPart = current;
            current = next;
        }
        ListNode pointer2 = reversedPart;
        while (pointer2 != null) {
            System.out.println(pointer2.val);
            pointer2 = pointer2.next;
        }
    }

}
