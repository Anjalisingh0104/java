package corejava;

import java.util.Scanner;

public class dowhile {
	public static void main(String[] args)
	{
		//Create Object for Scanner class
		Scanner sc = new Scanner(System.in);
		
		 int num, sum;
	        sum = 0;
	        num = 0;
	        
	        do
	        {
	            sum += num;
	            System.out.println("Enter a number : ");
	            num = sc.nextInt();
	        }
	        while(num>=0);
	        
	        System.out.println("The sum of numbers are: " + sum);
	        
	        sc.close();
		
	}

}
