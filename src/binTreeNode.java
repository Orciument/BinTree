public class binTreeNode {
    private binTreeNode left;
    private binTreeNode right;
    private Object content;

    public binTreeNode(Object content) {
        this.content = content;
    }

    public binTreeNode left() {
        return left;
    }

    public void setLeft(binTreeNode left) {
        this.left = left;
    }

    public binTreeNode right() {
        return right;
    }

    public void setRight(binTreeNode right) {
        this.right = right;
    }

    public Object content() {
        return content;
    }
}
