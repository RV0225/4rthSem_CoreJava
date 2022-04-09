package unit_01;

import java.util.*;
/* Problem Statement: P7_SwitchStatements: 
   Create a switch statement [Manual], In Which:
	 a. When you pass 1 your program would print current year
	 b. When you pass 2 your program would print current month
	 c. When you pass 3 your program would print current day
	 d. When you pass 4 your program would print Not applicable 
 * */

public class P7_SwitchStatement {

	public static void main(String[] args) {

		SwitchStatements obj = new SwitchStatements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int num;
		num = sc.nextInt();
		obj.switchStatements(num);

	}

}

class SwitchStatements {
	void switchStatements(int n) {
		switch (n) {
			case 1:
				System.out.println("2022");
				break;
			case 2:
				System.out.println("April");
				break;
			case 3:
				System.out.println("8");
				break;
			default:
				System.out.println("Not Applicable");
				break;
		}
	}
}