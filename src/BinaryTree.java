import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T> {
     Node<T> root;

     public void preOrder(Node<T> node){ //membuat fungsi untuk menampilkan tree secara pre order
          if (node==null) { //jika node null maka tidak mengembalikan apa apa
               return;
          }
          System.out.print(node.data + " "); // print datanya
          this.preOrder(node.kiri); //rekusrsif kiri
          this.preOrder(node.kanan); //rekusrsif kanan

     }
     public void inOrder(Node<T> node){
          if (node==null) {
               return;
          }
          this.inOrder(node.kiri);
          System.out.print(node.data + " ");
          this.inOrder(node.kanan);
     }

     public void postOrder(Node<T> node){
          if (node==null) {
               return;
          }
          this.postOrder(node.kiri);
          this.postOrder(node.kanan);
          System.out.print(node.data + " ");
     }

     public void levelOrder(Node<T> node){
          if (node == null) {
               return;
          } 
          Queue<Node<T>> q = new LinkedList<>();
          q.add(node);
          while(q.peek() != null){
               Node<T> n = q.poll();
               System.out.print(n.data + " ");
               q.add(n.kiri);
               q.add(n.kanan);
          } 
     }
}
