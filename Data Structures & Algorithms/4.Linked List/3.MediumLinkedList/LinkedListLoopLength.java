import java.util.HashMap;

// Node class represents a node
// in a linked list
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

public class LinkedListLoopLength {
    
    // Function to return the lenght
    // of loop when slow and fast are
    // on the same node
    static int findLength(Node slow, Node fast){
        
        // count to keep track of 
        // nodes encountered in loop
        int cnt = 1;
        
        // move fast by one step
        fast = fast.next;
        
        // traverse fast till it 
        // reaches back to slow
        while(slow!=fast){
            
            // at each node increase
            // count by 1 and move fast
            // forward by one step
            cnt++;
            fast = fast.next;
        }
        
        // loop terminates when fast reaches
        // slow again and the count is returned
        return cnt;
    }

    // Function to find the length
    // of the loop in a linked list
    static int lengthOfLoop(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Traverse the list to detect a loop
        while (fast != null && fast.next != null) {
            // Move slow one step
            slow = slow.next;  
            
            // Move fast two steps
            fast = fast.next.next; 

            // Step 2: If the slow and fast
            // pointers meet, there is a loop
            if (slow == fast) {
                return findLength(slow, fast);
            }
        }

        // Step 3: If the fast pointer reaches the end
        // there is no loop
        
        return 0; 
    }


    public static void main(String[] args) {
        // Create a sample linked list with a loop
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);

        // Create a loop from fifth to second
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        // This creates a loop
        fifth.next = second; 

        int loopLength = lengthOfLoop(head);
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}

//Time Complexity: O(N) The code traverses the entire linked list once, where 'n' is the number of nodes in the list. This traversal has a linear time complexity, O(n).
//Space Complexity: O(1) The code uses only a constant amount of additional space, regardless of the linked list's length. This is achieved by using two pointers (slow and fast) to detect the loop without any significant extra memory usage, resulting in constant space complexity, O(1).
