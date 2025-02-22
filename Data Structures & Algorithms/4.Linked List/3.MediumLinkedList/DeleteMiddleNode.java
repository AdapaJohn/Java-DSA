
import java.util.*;

// Node class represents a node in a linked list
class Node {
    // Data stored in the node
    int data; 
     // Pointer to the next node in the list
    Node next;     

    // Constructor with both data
    // and next node as parameters
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteMiddleNode {
    // Function to delete the
    // middle node of a linked list
    static Node deleteMiddle(Node head) {
        /* If the list is empty or has only one node,
           return null as there is no middle node to delete */
        if (head == null || head.next == null) {
            return null;
        }

        // Initialize slow and fast pointers
        Node slow = head;
        Node fast = head;
        fast = head.next.next;

        // Move 'fast' pointer twice as fast as 'slow'
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        if (slow.next != null) {
            slow.next = slow.next.next;
        }
        return head;
    }

    static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating a sample linked list:
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Display the original linked list
        System.out.print("Original Linked List: ");
        printLL(head);

        // Deleting the middle node
        head = deleteMiddle(head);

        // Displaying the updated linked list
        System.out.print("Updated Linked List: ");
        printLL(head);
    }
}

//Time Complexity: O(N/2) The algorithm traverses the linked list using the Tortoise and Hare approach. The code increments both 'slow' and 'fast' pointers at different rates, effectively covering about half the list before reaching the midpoint, hence the time complexity of the algorithm is O(N/2) ~ O(N).
//Space Complexity: O(1) The algorithm uses a constant amount of extra space regardless of the size of the input (linked list). It doesn't use any additional data structures in proportion to the input size. Thus, the space complexity is O(1) (constant space). 
