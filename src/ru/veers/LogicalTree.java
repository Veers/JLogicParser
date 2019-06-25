package ru.veers;

public class LogicalTree {
    private Node rootNode;
    private Node currentNode;
    private Node lastAddedNode;

    public LogicalTree(){}

    public LogicalTree(Node rootNode){
        setRootNode(rootNode);
        setCurrentNode(getRootNode());
        setLastAddedNode(getRootNode());
    }

    public Node getRootNode() {
        return rootNode;
    }

    public void setRootNode(Node rootNode) {
        this.rootNode = rootNode;
    }

    public Node getCurrentNode() {
        return currentNode;
    }

    public void setCurrentNode(Node currentNode) {
        this.currentNode = currentNode;
    }

    public Node getLastAddedNode() {
        return lastAddedNode;
    }

    public void setLastAddedNode(Node lastAddedNode) {
        this.lastAddedNode = lastAddedNode;
    }

    public void addNode(Node node) {
        System.out.println(node);
    }
}
