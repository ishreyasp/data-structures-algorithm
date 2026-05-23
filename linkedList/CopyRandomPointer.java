import org.w3c.dom.Node;

/**
You are given the head of a linked list of length n. Unlike a singly linked list, 
each node contains an additional pointer random, which may point to any node in the list, or null.

Create a deep copy of the list.
In the examples, the linked list is represented as a list of n nodes. Each node is represented as a 
pair of [val, random_index] where random_index is the index of the node (0-indexed) that the random pointer 
points to, or null if it does not point to any node.
 */
class CopyRandomPointer {
    /*
    // Definition for a Node.
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    */

    public Node copyRandomList(Node head) {
        if(head == null) {
            return head;
        }

        Node curr = head;
        while(curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;
        while(curr != null) {
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        
        Node newHead = head.next;
        curr = head;
        while(curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;

            if(copy.next != null) {
                copy.next = copy.next.next;
            }

            curr = curr.next;
        }
        return newHead;
    }
}
