package basic;
import java.util.*;
public class linked_list {
	public static class Node
	{
		int val ;
		Node next ;
		 Node(int val)
		 {
			 this.val = val;
		 }
	}
	public static class Stack
	{
		Node head = null;
		int size = 0;
		
		void push(int x)
		{
			
			Node temp = new Node(x);
			
			temp.next = head;
			head = temp;
			size++;
		}
		
		int pop()
		{
			if(head==null) 
			{
				System.out.println("Stack is empty");
				return -1;
			}
			int pop = head.val;
			head = head.next;
			size--;
			return pop;
			
		}
		
		int size()
		{
			return size;
		}
		
		int peek()
		{
			if(head==null)
			{
				System.out.println("Stack is empty");
				return -1;
				
			}
			return head.val;
		}
		
		void display()
		{
			dis(head);
			System.out.println();
		}
		void dis(Node h)
		{
			if(h==null) return;
			dis(h.next);
			System.out.print(h.val + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop();
		st.display();
		System.out.println(st.size());
		
	}

}
