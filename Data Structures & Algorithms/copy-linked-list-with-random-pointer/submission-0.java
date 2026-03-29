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

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> oldToNew = new HashMap<>();
        Node temp = head;
        Node dummy = new Node(-1);
        Node newTemp = dummy;
        while(temp != null) {
            Node newNode = new Node(temp.val);
            oldToNew.put(temp, newNode);
            newTemp.next = newNode;
            newTemp = newTemp.next;
            temp = temp.next;
        }
        temp = head;
        newTemp = dummy.next;
        while(temp != null) {
            newTemp.random = oldToNew.get(temp.random);
            temp = temp.next;
            newTemp = newTemp.next;
        }
        newTemp = dummy.next;
        return newTemp;
    }
}
