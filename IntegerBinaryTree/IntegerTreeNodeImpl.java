public class IntegerTreeNodeImpl implements IntegerTreeNode {
    int value;
    private IntegerTreeNode left;
    private IntegerTreeNode right;
    
    public IntegerTreeNodeImpl(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
    
    public int getValue() {
        return value;
    }
    
    public void setLeft(IntegerTreeNode node) {
        this.left = node;
    }
    
    public IntegerTreeNode getLeft() {
        return left;
    }
    
    public void setRight(IntegerTreeNode node) {
        this.right = node;
    }
    
    public IntegerTreeNode getRight() {
        return right;
    }
}