class Node {
    public int data;
    public Node next;

    // Constructor for Node with data and next node
    public Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor for Node with only data (next set to null)
    public Node(int data1) {
        data = data1;
        next = null;
    }
}

public class RemoveNthNodeFromEnd {
    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Function to delete the Nth node from the end of the linked list
    public static Node DeleteNthNodefromEnd(Node head, int N) {
        // Create two pointers, fastp and slowp
        Node fastp = head;
        Node slowp = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < N; i++)
            fastp = fastp.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fastp == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fastp.next != null) {
            fastp = fastp.next;
            slowp = slowp.next;
        }

        // Delete the Nth node from the end
        Node delNode = slowp.next;
        slowp.next = slowp.next.next;
        delNode = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }
}

//Time Complexity: O(N) since the fast pointer will traverse the entire linked list, where N is the length of the linked list.
//Space Complexity: O(1), as we have not used any extra space.
