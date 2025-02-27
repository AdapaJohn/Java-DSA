                                
// Node class to represent
// elements in the linked list
class CloneLinkedListWithRandomAndNextPointer {
    // Data stored in the node
    int data;
    // Pointer to the next node
    Node next;
    // Pointer to a random
    // node in the list
    Node random;

    // Constructors for Node class
    Node() {
        // Default constructor
        this.data = 0;
        this.next = null;
        this.random = null;
    }

    Node(int x) {
        // Constructor with data
        this.data = x;
        this.next = null;
        this.random = null;
    }

    Node(int x, Node nextNode, Node randomNode) {
        // Constructor with data,
        // next, and random pointers
        this.data = x;
        this.next = nextNode;
        this.random = randomNode;
    }
}

// Function to insert a copy of each
// node in between the original nodes
void insertCopyInBetween(Node head) {
    Node temp = head;
    while (temp != null) {
        Node nextElement = temp.next;
        // Create a new node with the same data
        Node copy = new Node(temp.data);

        // Point the copy's next to
        // the original node's next
        copy.next = nextElement;

        // Point the original
        // node's next to the copy
        temp.next = copy;

        // Move to the next original node
        temp = nextElement;
    }
}

// Function to connect random
// pointers of the copied nodes
void connectRandomPointers(Node head) {
    Node temp = head;
    while (temp != null) {
        // Access the copied node
        Node copyNode = temp.next;

        // If the original node
        // has a random pointer
        if (temp.random != null) {
            // Point the copied node's random to the
            // corresponding copied random node
            copyNode.random = temp.random.next;
        } else {
            // Set the copied node's random to
            // null if the original random is null
            copyNode.random = null;
        }

        // Move to the next original node
        temp = temp.next.next;
    }
}

// Function to retrieve the
// deep copy of the linked list
Node getDeepCopyList(Node head) {
    Node temp = head;
    // Create a dummy node
    Node dummyNode = new Node(-1);
    // Initialize a result pointer
    Node res = dummyNode;

    while (temp != null) {
        // Creating a new List by
        // pointing to copied nodes
        res.next = temp.next;
        res = res.next;

        // Disconnect and revert back to the
        // initial state of the original linked list
        temp.next = temp.next.next;
        temp = temp.next;
    }

    // Return the deep copy of the
    // list starting from the dummy node
    return dummyNode.next;
}

// Function to clone the linked list
Node cloneLL(Node head) {
    // If the original list
    // is empty, return null
    if (head == null) return null;

    // Step 1: Insert copy of
    // nodes in between
    insertCopyInBetween(head);
    // Step 2: Connect random
    // pointers of copied nodes
    connectRandomPointers(head);
    // Step 3: Retrieve the deep
    // copy of the linked list
    return getDeepCopyList(head);
}

// Function to print the cloned linked list
void printClonedLinkedList(Node head) {
    while (head != null) {
        System.out.print("Data: " + head.data);
        if (head.random != null) {
            System.out.print(", Random: " + head.random.data);
        } else {
            System.out.print(", Random: null");
        }
        System.out.println();
        // Move to the next node
        head = head.next;
    }
}

// Main function
public static void main(String[] args) {
    // Example linked list: 7 -> 14 -> 21 -> 28
    Node head = new Node(7);
    head.next = new Node(14);
    head.next.next = new Node(21);
    head.next.next.next = new Node(28);

    // Assigning random pointers
    head.random = head.next.next;
    head.next.random = head;
    head.next.next.random = head.next.next.next;
    head.next.next.next.random = head.next;

    System.out.println("Original Linked List with Random Pointers:");
    printClonedLinkedList(head);

    // Clone the linked list
    Node clonedList = cloneLL(head);

    System.out.println("\nCloned Linked List with Random Pointers:");
    printClonedLinkedList(clonedList);
}

//Time Complexity: O(3N)where N is the number of nodes in the linked list. The algorithm makes three traversals of the linked list, once to create copies and insert them between original nodes, then to set the random pointers of the copied nodes to their appropriate copied nodes and then to separate the copied and original nodes.
//Space Complexity : O(N) where N is the number of nodes in the linked list as the only extra additional space allocated it to create the copied list without creating any other additional data structures.
