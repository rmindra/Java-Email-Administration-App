package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Input first and last name: ");
		String firstName = input.next();
		String lastName = input.next();
		
		Email em1 = new Email(firstName, lastName);
		
		System.out.println(em1.showInfo());
		
		boolean loop = true;
		while(loop == true) {
			System.out.print("\nWant to Change or See another detail?\n1. Change\n2. See\n0. Exit\nEnter your choice: ");
			int choice = input.nextInt();
			
			if(choice == 1) { changeMethod(em1); }
			else if(choice == 2) { seeMethod(em1); }
			else{ loop = false;}
		}
		
		input.close();
		System.out.print("\n===== PROGRAM END =====");
	}

	private static void seeMethod(Email em1) {
		System.out.print("\nSEE METHOD: \n1. See Password\n2. See Alternate Email\n3. See Mailbox Capacity\n0. Exit\nEnter your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 1) { System.out.println("Your Password: " + em1.getPassword()); }
		if(choice == 2) { System.out.println("Your Alternate Email: " + em1.getAlternateEmail()); }
		if(choice == 3) { System.out.println("Your Mailbox Capacity: " + em1.getMailboxCapacity() + "mb"); }
		return;
	}

	private static void changeMethod(Email em1) {
		System.out.print("\nCHANGE METHOD: \n1. Change Password\n2. See Alternate Email\n3. See Mailbox Capacity\n0. Exit\nEnter your choice: ");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		if(choice == 1) { 
			System.out.print("New password: ");
			input.nextLine();
			String newPass = input.nextLine();
			em1.changePassword(newPass);
		}
		
		if(choice == 2) { 
			System.out.print("Set Alternate Email: ");
			input.nextLine();
			String newAltEmail = input.nextLine();
			em1.setAlternateEmail(newAltEmail); 
		}
		
		if(choice == 3) { 
			System.out.print("Set Mailbox Capacity: ");
			int newMailboxCapacity = input.nextInt();
			em1.setMailboxCapacity(newMailboxCapacity); 
		}
		return;
	}

}
