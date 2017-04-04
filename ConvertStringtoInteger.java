import java.util.Scanner;
/**
 * Created by Xin Yang at 11:31
 */
public class ConvertStringtoInteger 
{	
	public static int mystoi(String string) 
	{
		if (string == null || string.length() == 0)
			return 0;
		string = string.trim();
		char firstChar = string.charAt(0);
		int sign = 1, start = 0, len = string.length();
		long sum = 0;
		if (firstChar == '+') 
		{
			sign = 1;
			start++;
		} else if (firstChar == '-') 
		{
			sign = -1;
			start++;
		}
		for (int i = start; i < len; i++) 
		{
			if (!Character.isDigit(string.charAt(i)))
				return (int) sum * sign;
			sum = sum * 10 + string.charAt(i) - '0';
			if (sign == 1 && sum > Integer.MAX_VALUE)
				return Integer.MAX_VALUE;
			if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
				return Integer.MIN_VALUE;
		}

		return (int) sum * sign;
	}

public static void main ( String [ ] args )
	{
	System.out.println ("Please input a string");
	Scanner input = new Scanner(System.in);
    String s = input.nextLine();
    System.out.println ("Then integer is "+ ConvertStringtoInteger.mystoi(s));
	System.out.println ("The result divided by two is "+ ConvertStringtoInteger.mystoi(s)/2);
	}
}