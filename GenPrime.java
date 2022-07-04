package Practice;
import java.util.*;
public class GenPrime 
{
	static int count;
	public static void main(String[] args) 
	{

		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for(int i =1;i<=num;i++)
		{
			int numDivisors = 0;
			for(int divisor = 1;divisor<=i;divisor++)
			{
				if(i%divisor == 0)
				{
					numDivisors++;

				}
			}
			if(numDivisors==2)
			{
				System.out.print(+ i + " ");
			}
			else
			{
				numDivisors =0;
			}
		}		
	}
}




