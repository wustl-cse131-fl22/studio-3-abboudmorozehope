package studio3;

import java.util.Scanner;

public class sieveOfEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n= in.nextInt();
		boolean [] prime = new boolean [n];
		
		int i = 0;
		
		for (i=0 ; i<n ; i ++)
		{
			prime[i]=true;
		}
		for (i=0 ; i < Math.sqrt(n); i++)
		{
			 if (prime[i] == true)
			{
				 for(int j=i*i; j < n; j=j+i)
				 {
					 prime[i] = false;
				 }
			}
		}
		
		for( i = 0; i < n; i++) {
			if(prime[i] == true) {
				System.out.print(i);
			}
		
		}


		
		
		
	}

}
