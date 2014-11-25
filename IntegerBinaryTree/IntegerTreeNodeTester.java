public class IntegerTreeNodeTester
{
    public static void main (String[] args) {
        int[] array = {8, 3, 5, 2, 7};
        IntegerTreeNode tree = ListUtilities.arrayToTreeNode(10, array);
        System.out.println(tree.contains(11));
        System.out.println(tree.contains(5));
        System.out.println(tree.getMax());
        System.out.println(tree.getMin());
    }
}
