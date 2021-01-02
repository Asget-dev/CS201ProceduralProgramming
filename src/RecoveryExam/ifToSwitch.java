package RecoveryExam;

import java.util.Scanner;

public class ifToSwitch {

	public static void main(String[] args) {

//		if(selection==0)
//			System.out.println("You selected Magenta");
//		else if(selected==1)
//			System.out.println("You selected Cyan");
//		

		System.out.println("please type a number between 0 and 4:");
		Scanner scanner = new Scanner(System.in);
		int selection = scanner.nextInt();

		switch (selection) {
		case 0:
			System.out.println("You selected Magenta");
			break;
		case 1:
			System.out.println("You selected Cyan");
			break;
		case 2:
			System.out.println("You selected Red");
			break;
		case 3:
			System.out.println("You selected Blue");
			break;
		case 4:
			System.out.println("You selected Green");
			break;
		default:
			System.out.println("Invalid selection");
			break; // optional
		}
	}

}
