public class BinaryTree {
    
    public static void main(String[] args) {
        int data [] = {9,20,6,14,17,64,13,26,72};
        Node root = new Node(15);
        for (int i = 0; i < data.length; i++) {
            root.insert(data[i]);
        }
        
        System.out.println("Contiene el 15: " + root.contains(15));
        System.out.println("Contiene el 13: " + root.contains(13));
        System.out.println("Contiene el 26: " + root.contains(26));
        System.out.println("Contiene el 1: " + root.contains(1));
        
        System.out.println("In Order");
        root.printInOrder();
        System.out.println("Pre Order");
        root.printInPreOrder();
        System.out.println("Post Order");
        root.printInPostOrder();
        System.out.println("Altura");
        System.out.println(root.maxHeight());
        
        
    }
    
}
