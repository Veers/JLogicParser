package ru.veers;

public class ExpressionParser {
    public ExpressionParser(){

    }

    public static void parse(String expression) {

//        Node node1 = createExecNode("1");
//        Node node2 = createExecNode("2");
//        Node node3 = createExecNode("3");
//        Node node4 = createExecNode("4");
//
//        connectNodes(node1, node2);
//        connectNodes(node1, node3);
//        connectNodes(node2, node4);
//
//        System.out.println(node1);

        Node rootNode = createRootNode();
        LogicalTree logicalTree = new LogicalTree(rootNode);


        expression = expression.replaceAll("\\s+", "");
        System.out.println(expression);
        int pointer = 0;
        Node lastConnectParentNode = rootNode;
        Node lastOperationNode = rootNode;
        for (char ch: expression.toCharArray()) {
            if (pointer < expression.length()) {

                String currentCharaсterStr = String.valueOf(expression.charAt(pointer));

                if (pointer == expression.length()-1) {
//                    Node execNode = createExecNode(currentCharaсterStr);
//
//                    if (lastOperationNode.getType() == Type.OR)
//                        connectNodes(rootNode, execNode);
//                    else
//                        connectNodes(lastOperationNode, execNode);
                } else {

                    if (!Type.contains(currentCharaсterStr)) {

                        Node execNode = createExecNode(currentCharaсterStr);
//                        Node operationNode = createOperationNode(String.valueOf(expression.charAt(pointer + 1)));

                        logicalTree.addNode(execNode);

                    }
                }
                pointer++;
            }
        }

    }

    private static Node createOperationNode(String currentCharaсterStr) {
        Node exp = new Node();
//        System.out.println("create node " + currentCharaсterStr);
        if (currentCharaсterStr.equals("&"))
            exp.setType(Type.AND);
        if (currentCharaсterStr.equals("|"))
            exp.setType(Type.OR);
        return exp;
    }

    private static Node createExecNode(String command) {
        Node exp = new Node();
//        System.out.println("create node " + command);
        exp.setType(Type.EXEC);
        exp.setCommand(command);
        return exp;
    }

    private static Node createOrNode() {
        Node exp = new Node();
        exp.setType(Type.OR);
        return exp;
    }

    private static Node createRootNode() {
        Node exp = new Node();
        exp.setType(Type.OR);
        exp.setRoot(true);
        return exp;
    }

    private static void connectNodes(Node parentNode, Node childNode) {
        parentNode.children.add(childNode);
        childNode.setPrev(parentNode);
    }
}
