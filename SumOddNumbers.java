//1.WAP to find the sum of the odd numbers between 7 to 21 using for loop.
Display the odd numbers and print the sum as an output.







package firstApp;

public class SumOddNumbers {
   public static void main(String[] agrs) {
	   int start = 7;
	   int end = 21;
	   int sumOfOdds = 0;
	      
	   
	   for (int num = start; num<= end; num++)
	   {
		   
		   int o = 0;
		if(num % 2 != o ) {
			   System.out.print(num + " ");
			   sumOfOdds += num;
			   
		   }
	   }
	   System.out.println( sumOfOdds );
   }
}

