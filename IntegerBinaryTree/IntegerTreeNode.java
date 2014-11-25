public interface IntegerTreeNode {
    /**
     * 
     */
    void add(int newNumber);
    
    /**
     * 
     */
    boolean contains(int n);
    
    /**
     * 
     */
    int getMax();
    
    /**
     * 
     */
    int getMin();
    
    /**
     * 
     */
    String toString();
    
    /**
     * 
     */
    String toStringSimple();
    
    /**
     * 
     */
    int depth();
}
