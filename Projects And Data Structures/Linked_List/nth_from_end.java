package linked;

public class nth_from_end {
	public static Node nth(Node head , int n)
	{
		int size = 0;
		Node temp = head;
		while(temp!=null)
		{
			temp = temp.next;
			size++;
		}
		
		int m = size -n +1 ;
		temp = head;
		for(int i = 1 ; i<=m-1 ; i++)
		{
			temp=temp.next;
		}
		return temp;
	}
	public static Node nth2(Node head , int n )
	{
		Node fast = head;
		Node slow = head;
		for(int i = 1 ; i<= n ; i++)
		{
			fast = fast.next;
			
		}
		while(fast!=null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	public  static class Node
	{
		Node next ;
		int data;
		Node(int data)
		{
			this.data=data;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a = new Node(100);
		Node b = new Node(13);
		Node c = new Node(4);
		Node d = new Node(5);
		Node e = new Node(12);
		Node f = new Node(10);
		a.next=b;
		b.next= c ;
		c.next = d;
		d.next = e;
		e.next = f;
		Node temp = nth2(a,3);
		System.out.println(temp.data);
	}

}
