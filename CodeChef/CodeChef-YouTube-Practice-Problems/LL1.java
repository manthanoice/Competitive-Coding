class Node{
    	int val;
    	Node next;
    	Node(int x){
    		val = x; next = null;
    	}
    }
    int getNthNodeFromEnd(Node head, int n){
        Node temp = head;
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        temp = head;
        for(int i=0; i<length-n; i++)
            temp=temp.next;
        return temp.val;
    }
