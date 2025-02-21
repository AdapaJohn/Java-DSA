import java.util.*;

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}

class SegregateEvenAndOddNodesinLinkedList{
static ListNode head, tail; // head and tail of the LinkedList

static void PrintList(ListNode head) // Function to print the LinkedList
{
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
        System.out.print(curr.val+"-->");
    System.out.println("null");
}

static void InsertatLast(int value) // Function for creating a LinkedList
{

    ListNode newnode = new ListNode(value);
    if (head == null)
        {
        head = newnode;
        tail = newnode;
        }
    else
        tail = tail.next = newnode;
}

static ListNode SegregatetoOddEVen()
{
    // creating Heads of Odd and Even LinkedLists
    ListNode oddHead = new ListNode(-1), oddTail = oddHead;
    ListNode evenHead = new ListNode(-1), evenTail = evenHead;
    ListNode curr = head, temp;
    while (curr!=null)
    {
        // Breaking the Link of the curr Node.
        temp = curr;
        curr = curr.next;
        temp.next = null;

        if (temp.val%2!=0) // If odd Node,append to odd LinkedList
        {
            oddTail.next = temp;
            oddTail = temp;
        }
        else // If Even Node,append to even LinkedList
        {
            evenTail.next = temp;
            evenTail = temp;
        }
    }
    evenTail.next = oddHead.next; 
    // Appending Odd LinkedList at end of EvenLinkedList
    return evenHead.next;
} 

public static void main(String args[])
{
    InsertatLast(1);
    InsertatLast(2);
    InsertatLast(3);
    InsertatLast(4);
    System.out.println("Intial LinkedList : ");
    PrintList(head);
    ListNode newHead = SegregatetoOddEVen();
    System.out.println("LinkedList After Segregration ");
    PrintList(newHead);
}
}

//Time Complexity: O(N) N is the number of Nodes in LinkedList. As we are traversing LinkedList once.
//Space Complexity: O(1) We are just Manipulating the Links, not using any extra space.
