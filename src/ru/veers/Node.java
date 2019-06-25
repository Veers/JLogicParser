package ru.veers;

import java.util.ArrayList;
import java.util.List;

public class Node {
    public int uuid;
    public List<Node> children;
    public Type type;
    public String command;
    public Node prev;
    public boolean isRoot;

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public boolean isRoot() {
        return isRoot;
    }

    public void setRoot(boolean root) {
        isRoot = root;
    }

    public Node(){
        this.uuid = (int)(Math.random() * 50 + 1);
        this.children = new ArrayList<>();
    }

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public String toString(){
        return this.uuid + ":: Command: " + this.command + "; Type: " +  this.type +
                "; Parent node: " + (this.prev!=null ? this.prev.uuid : "ROOT NODE") + " Children nodes: "
                + printChildren(this.children);
    }

    private String printChildren(List<Node> children) {
        String res = "\r\n\t";
        for (Node node: children) {
            res+=node.toString();
        }
        return res;
    }
}
