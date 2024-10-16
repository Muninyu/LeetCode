import java.util.ArrayList;
import java.util.List;

public class problem133 {
    public static void main(String[] args){
        ArrayList[] nodeConnect = new ArrayList[4];
        for (ArrayList arrayList : nodeConnect){
            arrayList = new ArrayList<>();
        }
        nodeConnect[0].add(2);
        nodeConnect[0].add(4);
        nodeConnect[1].add(1);
        nodeConnect[1].add(3);
        nodeConnect[2].add(2);
        nodeConnect[2].add(4);
        nodeConnect[3].add(1);
        nodeConnect[3].add(3);
        Node node1 = new Node(1, nodeConnect[0]);
        for(int i = 0; i < 4; i++){
            Node node2 = new Node(2, nodeConnect[i]);
        }

    }
    public static Node cloneGraph(Node node){

        return node;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
