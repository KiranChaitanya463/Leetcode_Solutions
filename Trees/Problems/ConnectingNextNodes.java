package Trees.Problems;


//lc116
public class ConnectingNextNodes {
    public Node connect(Node root) {
        if(root==null || root.left==null) return root;

        //BFS approach

        // Queue<Node> q=new LinkedList<>();
        // q.offer(root);
        // while(!q.isEmpty()){
        //     int n=q.size();
        //     Node prev=q.peek();
        //     boolean isFirst=true;
        //     for(int i=0;i<n;i++){
        //         if(q.peek().left!=null) q.offer(q.peek().left);
        //         if(q.peek().right!=null) q.offer(q.peek().right);
        //         if(!isFirst){
        //             prev.next=q.peek();
        //             prev=prev.next;
        //         }
        //         q.poll();
        //         isFirst=false;
        //     }
        // }
        // return root;

        // DFS recursive approach
        traverse(root);
        return root;
    }
    public void traverse(Node root){
        if(root.left==null && root.right==null) return;
        root.left.next=root.right;
        if(root.next!=null)
            root.right.next=root.next.left;
        traverse(root.left);
        traverse(root.right);
    }
    class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
}
