package programs;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int n=5; for(int i=1;i<=n; i++) {
		 * 
		 * for (int space=n; space>=i;space--) { System.out.print(" ");
		 * 
		 * } for(int j=n;j>=i;j++); {
		 * 
		 * System.out.print("* ");
		 * 
		 * } System.out.println(); }
		 */
		//Scanner sc = new Scanner(System.in); 
        //System.out.println("Enter the number of rows to be printed"); 
       // int rows = sc.nextInt(); 
  
        // loop to iterate for the given number of rows 
        for (int i = 1; i <= 5; i++) { 
  
            // loop to print the number of spaces before the star 
               for (int j =5; j >= i; j--) { 
               System.out.print(" "); 
                  } 
  
            // loop to print the number of stars in each row 
            for (int k = 1; k <= i; k++) { 
                System.out.print("* "); 
            } 
  
            // for new line after printing each row 
            System.out.println();
        }
        }
}

