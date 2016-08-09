import java.util.Scanner;

public class Exercise30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String str_1=scan.nextLine();
		System.out.println("请输入第二个字符串");
		String str_2=scan.nextLine();
		int a=0;
		int b=Omar(str_1,str_2,a);
		System.out.println(b);
	}
	public static int Omar(String a,String b,int c)
	{
		c=a.indexOf(b);
		return c;
	}
}
