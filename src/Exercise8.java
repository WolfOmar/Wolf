import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char[] addchar
		//int j=0;
		//@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("«Î ‰»Î“ª¥Æ◊÷∑˚");
		String s=scan.nextLine().toLowerCase();
		scan.close();
		char[] ch=s.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			int INT_CHAR=ch[i]+5;
			if (INT_CHAR<=122)
			{
			 ch[i]=(char) INT_CHAR;
			}
			else if (INT_CHAR>122)
			{
				int INT=INT_CHAR-122+97;
				ch[i]=(char)INT;
			}
		}
		for (int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]+" ");
		}
		
	}

}
