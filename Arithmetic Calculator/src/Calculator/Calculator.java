//TANUSHREE GORASIYA

package Calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		
		 int choose,n1,n2,result;
		 
		 System.out.println("-------ARITHMITIC CALCULATOR-------\n");
		 System.out.println("1-> ADDITION");
		 System.out.println("2-> SUBBTRATION");
		 System.out.println("3-> MULTIPLICATION");
		 System.out.println("4-> DIVISION");
		 System.out.println("\n\n");
		 
		 System.out.println("Select a numbar : ");
		 choose = sc.nextInt();
		 System.out.println("Enter the first number : ");
		 n1 = sc.nextInt();
		 System.out.println("Enter the second number : ");
		 n2 = sc.nextInt();
		 System.out.println("\n\n");
		 
		 switch(choose) {
		 
		 case 1: 
			 System.out.println("User choice : ADDITION\n");
			 result = n1  + n2;
			 System.out.println("ADDITION : "+result);
			 break;		
			 
		 case 2: 
			 System.out.println("User choice : SUBBTRACTION\n");
			 result = n1 - n2;
			 System.out.println("SUBBTRACTION : "+result);
			 break;
			 
		 case 3: 
			 System.out.println("User choice : MULTIPLICATION\n");
			 result = n1 * n2;
			 System.out.println("MULTIPLICATION :"+result);
			 break;	
		 
		 case 4: 
			 System.out.println("User choice : DIVISION\n");
			 result = n1 / n2;
			 System.out.println("DIVISION :"+result);
			 break;	 
		 
		 default: 
			 System.out.println("User choice : INVALID INPUT\n");
			 break;
		 }		 
		 
	}

}
