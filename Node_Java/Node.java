class Node {

    // The class has two properties, a String data, and a Node next. At the top of
    // the class, declare both variables as public.
    public String data;
    public Node next;

    // We will create a basic node class that contains data and a link to the next
    // node. Our node’s data will be specified as a String, but the same class could
    // easily be changed to hold any other data type. Remember that a node’s link to
    // the next node is null when there are no more nodes to traverse.
    Node(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node node) { // here we get the object Address for the Node 2 and thus
        // first object points to Node2
        this.next = node;
    }

    public static void main(String[] args) {
        Node firstNode = new Node("I am first Node");
        Node secondNode = new Node("I am second Node"); // We are creating SecondNode
        // Now we are trying to point to the SecondNode using Object refernce
        // For Eg:Node@2 is second reference
        // therefore Node@1 --> Node@2(secondNode) the reference is passed and the
        // object is pointed
        // Since the object is pointed the data are by default preloaded during runtime
        firstNode.setNextNode(secondNode);
        System.out.println(firstNode.next.data);

    }
}