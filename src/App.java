public class App {
    public static void main(String[] args) throws Exception {
        BinaryTree<String> p = new BinaryTree<>();

        p.root = new Node<String>("/");
        p.root.kiri = new Node<>("*");
        p.root.kanan = new Node<>("+");
        p.root.kiri.kiri = new Node<>("+");
        p.root.kiri.kanan = new Node<>("-");
        p.root.kiri.kiri.kiri = new Node<>("a");
        p.root.kiri.kiri.kanan = new Node<>("b");
        p.root.kiri.kanan.kiri = new Node<>("c");
        p.root.kiri.kanan.kanan = new Node<>("d");
        p.root.kanan.kiri = new Node<>("e");
        p.root.kanan.kanan = new Node<>("f");

        p.preOrder(p.root);
        System.out.println("  = PreOrder");
        p.inOrder(p.root);
        System.out.println("  = InOrder");
        p.postOrder(p.root);
        System.out.println("  = PostOrder");
        p.levelOrder(p.root);
        System.out.println("  = PostOrder");
    }
}
