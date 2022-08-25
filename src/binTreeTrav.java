public class binTreeTrav {

    static binTreeNode root;

    public static void main(String[] args) {
        root = createSimpsonsTree();
        System.out.println(preOrder(root));
        System.out.println(inOrder(root));
        System.out.println(postOrder(root));
        System.out.println(countNodes(root));
    }

    public static binTreeNode createTree() {
        binTreeNode node5 = new binTreeNode(5);
        binTreeNode node3 = new binTreeNode(3);
        binTreeNode node9 = new binTreeNode(9);
        binTreeNode node6 = new binTreeNode(6);
        binTreeNode node7 = new binTreeNode(7);
        binTreeNode node11 = new binTreeNode(11);
        binTreeNode node10 = new binTreeNode(10);
        attachTO(node5, node3, true);
        attachTO(node5, node9, false);
        attachTO(node9, node11, false);
        attachTO(node11, node10, true);
        attachTO(node9, node6, true);
        attachTO(node6, node7,false);

        return node5;
    }
    public static binTreeNode createSimpsonsTree() {
        binTreeNode lisa = new binTreeNode("Lisa Simpson");
        binTreeNode marge = new binTreeNode("Marge Simpson");
        binTreeNode homer = new binTreeNode("Homer Simpson");
        attachTO(lisa,marge,true);
        attachTO(lisa,homer,false);
        attachTO(marge, new binTreeNode("Jacqueline Boulevier"), true);
        attachTO(marge, new binTreeNode("Clancy Boulevier"), false);
        attachTO(homer, new binTreeNode("Mona Simpson"), true);
        attachTO(homer, new binTreeNode("Abraham J. Simpson"), false);
        return lisa;
    }
    public static void attachTO(binTreeNode father, binTreeNode child, boolean left) {
        if (left) {
            father.setLeft(child);
            return;
        }
        father.setRight(child);
    }

    //Nr.3 c)
    public static String preOrder(binTreeNode node) {
        if(node == null) return "";

        return node.content().toString() + "," + inOrder(node.left()) + inOrder(node.right());
    }

    public static String inOrder(binTreeNode node) {
        if(node == null) return "";

        return inOrder(node.left()) + node.content().toString() + "," + inOrder(node.right());
    }

    public static String postOrder(binTreeNode node) {
        if(node == null) return "";

        return inOrder(node.left()) + inOrder(node.right()) + node.content().toString() + ",";
    }
    /*
    Nr.3 d)
    Die Methode ist eine iterative Variante
    */

    //Nr.3 e)
    public static int countNodes(binTreeNode node) {
        if(node == null) return 0;

        return countNodes(node.left()) + countNodes(node.right()) + 1;
    }
}
