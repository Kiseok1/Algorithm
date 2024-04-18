import java.util.*;

class Node {
	
	public int value;
	public int x;
	public int y;
	public Node right;
	public Node left;
	
	public Node(int value, int x, int y, Node right, Node left) {
		this.value = value;
		this.x = x;
		this.y = y;
		this.right = right;
		this.left = left;
	}
}

class Solution {
	int index = 0;
	int[][] answer;
	public int[][] solution(int[][] nodeinfo) {
		Node[] nodes = new Node[nodeinfo.length];
		for(int i=0;i<nodeinfo.length;i++) {
			nodes[i] =new Node(i+1,nodeinfo[i][0],nodeinfo[i][1],null,null);
		}
		Arrays.sort(nodes, new Comparator<Node>() {
			public int compare(Node a, Node b) {
				if(a.y==b.y) {
					return a.x-b.x;
				}
				return b.y-a.y;
			}	
		});
		
		Node parent = nodes[0];
		
		for(int i=1;i<nodes.length;i++) {
			MakeTree(parent,nodes[i]);
		}
		
		answer = new int[2][nodeinfo.length];
		
		preorder(nodes[0]);
		index=0;
		postorder(nodes[0]);
		
        return answer;
	}

	public void preorder(Node node) {
		if(node!=null) {
			answer[0][index++] = node.value;
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node node) {
		if(node!=null) {
			postorder(node.left);
			postorder(node.right);
			answer[1][index++] = node.value;
		}
	}

	public void MakeTree(Node parent, Node node) {
		if(parent.x<node.x) {
			if(parent.right==null) {
				parent.right=node;
			} else {
				MakeTree(parent.right,node);
			}
		} else {
			if(parent.left==null) {
				parent.left=node;
			} else {
				MakeTree(parent.left,node);
			}
		}	
	}
	
}