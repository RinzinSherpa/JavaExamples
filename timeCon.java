package Conversion;
import java.util.*;
public class timeCon 
{

	public static double hoursToSeconds(int number)
	{
		return number * (3600/1);
	}
	
	public static double secondsToHours(int number) {
		return number / 3600;
	}
	
	
	public static void main(String[] args)
	{
		// Ask user for mode
		System.out.println("Press 1 to convert Hour to Seconds");
		System.out.println("Press 2 to convert Seconds to Hour");
		Scanner sc = new Scanner (System.in);
		int mode = sc.nextInt();
		
		// Ask user for number
		System.out.println("Please enter the number");
		int number = sc.nextInt();
		
		// Convert and print result
		if (mode == 1) {
			double converted = timeCon.hoursToSeconds(number);
			System.out.println(number +" "+ "Seconds is equal to" +" "+ converted + " "+ "Hours");
		}
		else
		{
			double converted = timeCon.secondsToHours(number);
			System.out.println(number +" "+ "Seconds is equal to" +" "+ converted + " "+ "Hours");
		}
	}

}
