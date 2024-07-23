package vn.edu.likelion.app.Day10.LeetCode;

public class AddTwoNumber {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }


        return dummy.next;
    }

    public static void main(String[] args) {
        // Tạo số thứ nhất
        ListNode l13 = new ListNode(3);
        ListNode l12 = new ListNode(4, l13);
        ListNode l11 = new ListNode(2, l12);
        ListNode l111 = new ListNode(2, l11);

        // Tạọ số thứ hai
        ListNode l23 = new ListNode(4);
        ListNode l22 = new ListNode(6, l23);
        ListNode l21 = new ListNode(5, l22);

        // Cộng hai số
        ListNode addTwoNumber = addTwoNumbers(l21, l111);

        // Show addTwoNumer
        System.out.println("Số cần tìm");
        while (addTwoNumber != null) {
            System.out.print(addTwoNumber.val + " ");
            addTwoNumber = addTwoNumber.next;
        }

    }
}
