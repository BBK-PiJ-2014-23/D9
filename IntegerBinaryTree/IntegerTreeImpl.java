public class IntegerTreeImpl implements IntegerTree {
    IntegerTreeNode first;

    public IntegerTreeImpl() {
        first = null;
    }

    public void add(int newNumber) {
        IntegerTreeNode node = new IntegerTreeNodeImpl(newNumber);
        if (first == null) {
            first = node;
            return;
        }
        
        boolean finished = false;
        IntegerTreeNode current = first;
        while (!finished) {
            if (node.getValue() > current.getValue()){
                if (current.getRight() == null) {
                    current.setRight(node);
                    finished = true;
                } else {
                    current = current.getRight();
                }
            } else {
                if (current.getLeft() == null) {
                    current.setLeft(node);
                    finished = true;
                } else {
                    current = current.getLeft();
                }
            }
        }
    }

    public boolean contains(int number) {
        IntegerTreeNode node = new IntegerTreeNodeImpl(number);
        if (first.getValue() == node.getValue()) {
            return true;
        }
        
        boolean finished = false;
        boolean found = false;
        IntegerTreeNode current = first;
        while (!finished) {
            if (node.getValue() > current.getValue()){
                if (current.getRight().getValue() == node.getValue()) {
                    found = true;
                    finished = true;
                } else if (current.getRight() == null) {
                    found = false;
                    finished = true;
                } else {
                    current = current.getRight();
                }
            } else {
                if (current.getLeft().getValue() == node.getValue()) {
                    found = true;
                    finished = true;
                } else if (current.getLeft() == null) {
                    found = false;
                    finished = true;
                } else {
                    current = current.getLeft();
                }
            }
        }
        return found;
    }
    
    public int getMax() {
        return 0;
    }
    
    public int getMin() {
        return 0;
    }
}