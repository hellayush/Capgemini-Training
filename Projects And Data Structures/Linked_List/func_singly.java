package linked;

public class func_singly {
		public static class Node
		{
			int data;
			Node next;
			Node(int data)
			{
				this.data = data;
			}
		}
		public  static class linkedList 
		{
			Node head  = null;
			Node tail  = null;
			
			 void add(int val)
			{
				Node temp = new Node(val);
				if(head==null)
				{
					head = temp;
				}
				else
				{
					tail.next=temp;
				}
				tail=temp;
			}
			 
			 int size()
			 {
				 int c =0;
				 Node temp = head;
				 while(temp!=null)
				 {
					 c++;
					 
					temp = temp.next;
				 }
				 return c;
			 }
			 void display()
			 {
				 Node temp = head;
				 while(temp!=null)
				 {
					 System.out.print(temp.data + " ");
					 temp = temp.next;
				 }
				 System.out.println();
			 }
			 void begin(int val)
			 {
				 Node temp = new Node(val);
				 if(head==null) {
					 head= temp;
					 tail = temp;
				 }
				 else
				 {
					 temp.next=head;
					 head=temp;
				 }
			 }
			 void insert(int idx , int val)
			 {
				 Node t = new Node(val);
				 
				 if(idx==0)
				 {
					 begin(val);
				 }
				 else if(idx==size())
				 {
					add(val); 
				 }
				 else
				 {
					 Node temp = head;
					 for(int i = 0 ; i<=idx-1 ; i++)
					 {
						 temp = temp.next;
					 }
					 t.next=temp.next;
					 temp.next=t;
				 }
			 }
			 int element(int idx)
			 {
				 Node temp = head;
				 for(int i =0 ; i<idx;i++)
				 {
					 temp = temp.next;
					 
				 }
				 return temp.data;
			 }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		linkedList ll = new linkedList();
		ll.add(12);
		ll.add(111);
		ll.add(123);
		ll.display();
		int c= ll.size();
		System.out.println(c);
		ll.begin(11);
		ll.display();
		ll.insert(3, 1);
		ll.display();
		int d = ll.element(3);
		System.out.println(d);
		
	}

}
