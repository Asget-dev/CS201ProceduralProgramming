package RecoveryExam;

import java.util.Scanner;

public class testScoreIF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your score");
		double score = scanner.nextDouble();
		
		if(score>=83) {
			System.out.println("Pass");
			
		}else if(score ==0) {
			System.out.println("What happened??");
		}else {
			System.out.println("Fail");
			System.out.println("Try hard next time");
		}
		

	}

}
