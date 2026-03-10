package dice_game;
import java.util.Random;
import java.util.Scanner;

public class dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int choice ;
		
		while(true)
		{
			 	System.out.println("\n1. Roll Dice");
	            System.out.println("2. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();
	            sc.nextLine();
	            
	            if(choice==1)
	            {
	            	System.out.print("Player 1 press ENTER...");
	                sc.nextLine();
	                int p1 = r.nextInt(6) + 1;

	                System.out.print("Player 2 press ENTER...");
	                sc.nextLine();
	                int p2 = r.nextInt(6) + 1;

	                System.out.println("Player 1 rolled: " + p1);
	                System.out.println("Player 2 rolled: " + p2);
	                if (p1 > p2)
	                    System.out.println(" Player 1 Wins!");
	                else if (p2 > p1)
	                    System.out.println(" Player 2 Wins!");
	                else
	                    System.out.println(" Draw!");

	            } else if (choice == 2) {
	                System.out.println("Game Ended. Thank you!");
	                break;

	            } else {
	                System.out.println("Invalid choice!");
	            }
	        }

	        sc.close();

	            }

		
	}


