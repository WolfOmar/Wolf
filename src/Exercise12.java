import java.util.Scanner;
public class Exercise12 {
	static int A1_price=2;
	static int A1_number=5;
	static int A2_price=3;
	static int A2_number=10;
	static int A3_price=4;
	static int A3_number=14;
	static int one_number=5;
	static int two_number=5;
	static int five_number=3;
public static void main(String[] args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("ÇëÊäÈëÃüÁî");
	String s=scan.nextLine();
	scan.close();
	String[] str=s.split(",");
	for (int i=0;i<str.length;i++)
	{
		if ("p 1".equals(str[i]))
		{
			one_number++;
		}
		if ("p 2".equals(str[i]))
		{
			two_number++;
		}
		if ("p 5".equals(str[i]))
		{
			five_number++;
		}
		if ("b A1".equals(str[i]))
		{
			A1_number--;
		}
		if ("b A2".equals(str[i]))
		{
			A2_number--;
		}
		if ("b A3".equals(str[i]))
		{
			A3_number--;
		}
	}
	System.out.println("A1 "+A1_number+","+"A2 "+A2_number+","+"A3 "+A3_number+";"+"1 "+one_number+","+"2 "+two_number+","+"5 "+five_number);
}


}
