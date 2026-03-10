package collections;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class hashset_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  System.out.println("Mobile Shop");
		  Scanner sc = new Scanner(System.in);

	        
	        Set<String> customerIds = new HashSet<>();

	        
	        Map<String, String> customerBrand = new HashMap<>();

	        while (true) {
	            System.out.println("\n===== MOBILE SHOP MENU =====");
	            System.out.println("1. Add Customer & Brand");
	            System.out.println("2. Get Size");
	            System.out.println("3. Get Customer Details");
	            System.out.println("4. Display All");
	            System.out.println("5. Remove Customer");
	            System.out.println("6. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine(); 

	            
	            if (choice == 1) {
	                System.out.println("Enter Customer ID:");
	                String id = sc.nextLine();

	                if (customerIds.contains(id)) {
	                    System.out.println("Customer already exists!");
	                    continue;
	                }

	                System.out.println("Enter Brand:");
	                String brand = sc.nextLine();

	                customerIds.add(id);
	                customerBrand.put(id, brand);

	                System.out.println("Customer added successfully!");

	            }

	            
	            else if (choice == 2) {
	                System.out.println("Total Customers: " + customerIds.size());
	            }

	            
	            else if (choice == 3) {
	                System.out.println("Enter Customer ID:");
	                String id = sc.nextLine();

	                if (customerBrand.containsKey(id)) {
	                    System.out.println("Customer ID: " + id);
	                    System.out.println("Brand: " + customerBrand.get(id));
	                } else {
	                    System.out.println("Customer not found!");
	                }
	            }

	            
	            else if (choice == 4) {
	                System.out.println("\n--- Customer List ---");
	                for (String id : customerIds) {
	                    System.out.println(id + " -> " + customerBrand.get(id));
	                }
	            }

	            
	            else if (choice == 5) {
	                System.out.println("Enter Customer ID to remove:");
	                String id = sc.nextLine();

	                if (customerIds.remove(id)) {
	                    customerBrand.remove(id);
	                    System.out.println("Customer removed successfully!");
	                } else {
	                    System.out.println("Customer not found!");
	                }
	            }

	            
	            else if (choice == 6) {
	                System.out.println("Exiting Mobile Shop...");
	                break;
	            }

	            else {
	                System.out.println("Invalid choice!");
	            }
	        }

	        sc.close();
	}

}
