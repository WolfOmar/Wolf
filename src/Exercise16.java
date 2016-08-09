import java.util.Scanner;
public class Exercise16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			
			System.out.println("ÇëÊäÈë×Ö·û´®");
			
			String str=scan.next();
			
			char[] ch=str.toCharArray();
			ZipData(CutStr(ch));
	}
	
	
		public static String CutStr(char[] ch_1)
		{
			StringBuffer buf=new StringBuffer();
			
			for (int i=0;i<ch_1.length;i++)
			{
				if (ch_1[i]>=65 && ch_1[i]<=90)
				{
					buf.append(ch_1[i]);
				}
			}
			String str2=buf.toString();
			System.out.println(str2);
			return str2;
		}
		
			
			public static void ZipData(String str2)
			{
				
			StringBuffer buf2=new StringBuffer();
			int count=0;
			char ch2='A';
			for (int i=1;i<=25;i++)
			{
				for (int j=0;j<str2.length();j++)
				{
					if (ch2==str2.charAt(j))
					{
						count++;
					}
				}
				if (count==0)
				{
					ch2=(char)(ch2+1);
				}
				else
					buf2.append(ch2).append(count);
					count=0;
					ch2=(char)(ch2+1);
			}
			System.out.println(buf2.toString());
		
	}

}
