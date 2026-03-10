package collections;
import java.util.*;
public class project {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		 while (true) {
	            System.out.println("1 Add  2 Update  3 Delete  4 Printing  5 Exit");
	            System.out.print("Choice: ");
	            int choice = sc.nextInt();
	            sc.nextLine();   
	            
	            if (choice == 1) {
	                System.out.print("Enter name: ");
	                names.add(sc.nextLine());
	                System.out.println("Added");

	            } else if (choice == 2) {
	                System.out.print("Index: ");
	                int i = sc.nextInt();
	                sc.nextLine();
	                System.out.print("New name: ");
	                names.set(i, sc.nextLine());
	                System.out.println("Updated");

	            } else if (choice == 3) {
	                System.out.print("Index: ");
	                names.remove(sc.nextInt());
	                System.out.println("Deleted");

	            } else if (choice == 4) {
	                System.out.println(names);

	            } else if (choice == 5) {
	                break;
	            }
	        }
	        sc.close();
	    }
	}
	