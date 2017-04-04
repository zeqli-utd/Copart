import java.util.Scanner;
/**
 * Created by Xin Yang at 12:59
 */
public class LicenseKeys 
{
	public static String licenseKeyFormatting(String s, int k) 
	{
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
            if (s.charAt(i) != '-')
                sb.append(sb.length() % (k + 1) == k ? '-' : "").append(s.charAt(i));
        return sb.reverse().toString().toUpperCase();
    } 
	public static void main ( String [ ] args )
	{
	System.out.println ("Please input a keystring");
	Scanner inputs = new Scanner(System.in);
    String s = inputs.nextLine();
    System.out.println ("Please input the keyinteger");
	Scanner inputi = new Scanner(System.in);
    int k = inputi.nextInt();
    System.out.println ("The key is "+ LicenseKeys.licenseKeyFormatting(s,k));
	}

}
