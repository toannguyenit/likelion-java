package vn.edu.likelion.app.Day17.Exercise.Bai1;

public class App {
    public static void main(String[] args) {
        int[] headArr = {1,2,3,4,5};
        Node head = new Node(headArr[0]);
        Node temp = head;
        for (int i = 1; i < headArr.length; i++) {
            temp.next = new Node(headArr[i]);
            temp = temp.next;
        }

//        Node cur = head;
//        int count = 1;
//        while (cur.next != null) {
//            cur = cur.next;
//            count++;
//        }
//        int middle = count / 2;
//        cur = head;
//        for (int i = 1; i <= middle; i++) {
//            cur = cur.next;
//        }
//        System.out.println(cur.value);

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println(slow.value);
    }
}
