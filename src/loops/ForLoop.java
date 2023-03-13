package loops;

import java.util.Scanner;

public class ForLoop 
{
	 public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in); 
		    System.out.print("Enter Positive No: ");
		    int no = myObj.nextInt();
		    int count,sum=0;
		    for(count = 1; count <= no; ++count) {
		    	  sum += count;
		    	 }
		    System.out.println("Sum = "+sum);
	 }
}
