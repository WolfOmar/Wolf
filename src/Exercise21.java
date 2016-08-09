import java.util.Scanner;
public class Exercise21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			String b=Integer.toBinaryString(a);
			for (int i=b.length()-1;i>=0;i--)
			{
				char c=b.charAt(i);
				if (c=='1')
				{
					System.out.println(b.length()-i-1);
					break;
				}
			}
	}

}
