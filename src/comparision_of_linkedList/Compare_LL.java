package comparision_of_linkedList;

import java.util.Scanner;

import high.LinkedList;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}

class LinkedList{
	Node head;
	void insertAtEnd(int val) {
		Node n= new Node(val);
		if(head==null) {
			head=n;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;			
		}
		temp.next=n;
				
	}
	
	void comparing(Node h1,Node h2) {
		while(h1!=null && h2!=null) {
		if(h1.val==h2.val) {
			h1=h1.next;
			h2=h2.next;
		}
		else {System.out.print(0);
		return;
		}
		
		}
		
		if(h1==null || h2==null) {
			System.out.print(0);
		}
		else {System.out.print(1);}
		}
		}



public class Compare_LL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        for(int i = 0; i < n; i++){
                l1.insertAtEnd(sc.nextInt());
        }
        for(int i = 0; i < m; i++){
            l2.insertAtEnd(sc.nextInt());
    }
        comparision_of_linkedList.LinkedList linkedList1 = new comparision_of_linkedList.LinkedList();
		linkedList1.comparing(l1.head, l2.head);
	}

}
