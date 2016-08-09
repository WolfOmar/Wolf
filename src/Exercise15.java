import java.util.Scanner;
public class Exercise15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			System.out.println("ÇëÊäÈëÒ»´®×Ö·û");
			String str1=scan.next();
			System.out.println("ÇëÊäÈëÁíÒ»´®×Ö·û");
			String str2=scan.next();
			char[] ch1=str1.toLowerCase().toCharArray();
			char[] ch2=str2.toLowerCase().toCharArray();
			int a=0;
			for (int i=0;i<ch1.length;i++)
			{
				a=a+ch1[i]-ch2[i];
			}
			String str = "abcdefg";
			str = str.replace("b","a");
	}


}
