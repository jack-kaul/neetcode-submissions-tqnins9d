class Node {
    public Character val;
    public Node next;
    public Map<Character, Node> childNodes;
    boolean isLastNode;

    public Node(Character val) {
        this.val = val;
        this.next = null;
        childNodes = new HashMap<>();
        isLastNode = false;
    }

}

class PrefixTree {
    Node head;

    public PrefixTree() {
        head = new Node('h');
    }

    public void insert(String word) {
        Node curr = head;
        for(int i = 0; i < word.length(); i++) {
            if(curr.childNodes.size() > 0 && curr.childNodes.get(word.charAt(i)) != null) {
                curr = curr.childNodes.get(word.charAt(i));
            } else {
                Node currCharNode = new Node(word.charAt(i));
                curr.childNodes.put(word.charAt(i), currCharNode);
                curr = currCharNode;
            }
        }
        curr.isLastNode = true;

    }

    public boolean search(String word) {
        Node curr = head;
        for(int i = 0; i < word.length(); i++) {
            if(curr.childNodes.size() > 0 && curr.childNodes.get(word.charAt(i)) != null) {
                curr = curr.childNodes.get(word.charAt(i));
            } else {
                return false;
            }
        }
        if(curr.isLastNode) {
            return true;
        }
        return false;
    }

    public boolean startsWith(String word) {
        Node curr = head;
        for(int i = 0; i< word.length(); i++) {
            if(curr.childNodes.size() > 0 && curr.childNodes.get(word.charAt(i)) != null) {
                curr = curr.childNodes.get(word.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}
