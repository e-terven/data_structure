package LinearDataStructure;

public class NodeSingle {

    public String data;
    private NodeSingle next;

    public NodeSingle(String data) {
        this.data = data;
        this.next = null;
    }

    public void setNextNode(NodeSingle node) {
        this.next = node;
    }

    public NodeSingle getNextNode() {
        return this.next;
    }

    public static void main(String[] args) {
        NodeSingle strawberry = new NodeSingle("Berry Tasty");
        NodeSingle banana = new NodeSingle("Banana-rama");
        NodeSingle coconut = new NodeSingle("Nuts for Coconut");

        strawberry.setNextNode(banana);
        banana.setNextNode(coconut);

        NodeSingle currentNode = strawberry;
        while (currentNode != null) {
            System.out.print(currentNode.data);
            currentNode = currentNode.getNextNode();
        }
    }
}
