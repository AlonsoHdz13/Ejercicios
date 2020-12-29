class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
    }
    
    public void insert(int value) {
        if(value <= data) {
            if (left == null) left = new Node(value);
            else left.insert(value);
        }else {
            if(right == null) right = new Node(value);
            else right.insert(value);
        }
    }
    
    public boolean contains(int value) {
        if (data == value) {
            return true;
        }else if (value < data) {
            if(left == null) return false;
            else return left.contains(value);
        }else {
            if(right == null) return false;
            else return right.contains(value);
        }
    }
    
    public void printInOrder() {
        if (left != null) left.printInOrder();
        System.out.println(data);
        if (right != null) right.printInOrder();
    }
    
    public void printInPreOrder() {
        System.out.println(data);
        if(left != null) left.printInPreOrder();
        if(right != null) right.printInPreOrder();
    }
    
    public void printInPostOrder() {
        if(left != null) left.printInPostOrder();
        if(right != null) right.printInPostOrder();
        System.out.println(data);
    }
    
    public int maxHeight() {
        if (left == null && right == null) return 0;
        else if (left == null) return 1+ right.maxHeight();
        else if (right == null) return 1+left.maxHeight(); 
        else return 1+Integer.max(left.maxHeight(), right.maxHeight());
    }
    
}
