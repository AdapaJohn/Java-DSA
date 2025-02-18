                                
import java.util.HashMap;

// Node class represents a
// node in a linked list
class Node {
    // Data stored in the node
    int data;        
    // Pointer to the next node in the list
    Node next;      

    // Constructor with both data
    // and next node as parameters
    Node(int data1, Node next1) {
        data = data1;
        next = next1;
    }

    // Constructor with only data as
    // a parameter, sets next to null
    Node(int data1) {
        data = data1;
        next = null;
    }
}

public class LinkedListLoopDetection {
    // Function to find the first node
    // of the loop in a linked list

    public static Node firstNode(Node head) {
        // Initialize a slow and fast 
        // pointers to the head of the list
        Node slow = head;  
        Node fast = head;  
    
        // Phase 1: Detect the loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;        
            
            // Move fast two steps
            fast = fast.next.next;  
    
            // If slow and fast meet,
            // a loop is detected
            if (slow == fast) {
                // Reset the slow pointer
                // to the head of the list
                slow = head; 
    
                // Phase 2: Find the first node of the loop
                while (slow != fast) {
                    // Move slow and fast one step
                    // at a time
                    slow = slow.next;  
                    fast = fast.next;  
    
                    // When slow and fast meet again,
                    // it's the first node of the loop
                }
                
                // Return the first node of the loop
                return slow;  
            }
        }
        
        // If no loop is found, return null
        return null; 
    }

    public static void main(String[] args) {
        // Create a sample linked list with a loop
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.next = node2;
        Node node3 = new Node(3);
        node2.next = node3;
        Node node4 = new Node(4);
        node3.next = node4;
        Node node5 = new Node(5);
        node4.next = node5;

        // Make a loop from node5 to node2
        node5.next = node2;

        // Set the head of the linked list
        Node head = node1;

        // Detect the loop in the linked list
        Node loopStartNode = firstNode(head);

        if (loopStartNode != null) {
            System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
        } else {
            System.out.println("No loop detected in the linked list.");
        }
    }
}

//Time Complexity: O(N) The code traverses the entire linked list once, where 'n' is the number of nodes in the list. This traversal has a linear time complexity, O(n).
//Space Complexity : O(1) The code uses only a constant amount of additional space, regardless of the linked list's length. This is achieved by using two pointers (slow and fast) to detect the loop without any significant extra memory usage, resulting in constant space complexity, O(1).
