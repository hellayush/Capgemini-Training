package linked;

public class singly {
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void revrse(Node head)
	{
		if(head==null) return;
		revrse(head.next);
		System.out.print(head.data + " ");
	}
		public static void printlist(Node head)
		{
			Node temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		
	}
		public static int length(Node head)
		{
			int c= 0;
			Node temp = head;
			while(temp!=null)
			{
				c++;
				temp = temp.next;
			}
			return c;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(5);
		Node b = new Node(7);
		Node c = new Node(10);
		Node d = new Node(13);
		Node e = new Node(15);
		a.next=b ; b.next=c ;c.next=d ;d.next=e ;
//		System.out.println(a.next.data);
//		Node temp = a;
//		while(temp!=null)
//		{
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
		printlist(a);
		System.out.println();
		revrse(a);
		int a1 = length(a);
		System.out.println(a1);
	}

}
