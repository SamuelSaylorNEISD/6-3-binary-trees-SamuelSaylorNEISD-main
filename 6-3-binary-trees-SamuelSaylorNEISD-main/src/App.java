public class App {
    public static void main(String[] args) throws Exception {
        BinTree tree = new BinTree();
        tree.insert(5);
        tree.insert(12);
        tree.insert(16);
        tree.insert(0);
        tree.insert(-5);
        tree.insert(5);
        tree.displayTree();
        System.out.println(tree.search(16));
        System.out.println(tree.search(321312));
    }
}
