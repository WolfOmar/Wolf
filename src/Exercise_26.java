import java.util.*;
public class Exercise_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			String str=scan.nextLine();
			scan.close();
			String[] str_2=str.split(" ");
			int len=str_2.length;
			int[] a=new int[len];
			for (int i=0;i<len;i++)
			{
				a[i]=Integer.parseInt(str_2[i]);
			}
			sort(a);
			sort_2(a);
	}
	
	public static void sort(int[] b)
	{
		int tmp=0;
		for (int i=1;i<b.length;i++)
		{
			for (int j=i-1;j>=0;j--)
			{
				if (b[i]>b[j])
				{
					tmp=b[i];
					b[i]=b[j];
					b[j]=tmp;
					i=j;
				}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");	
		}
		
	}
	public static void sort_2(int[] s)
	{
		int tmp=0;
		for (int i=0;i<s.length;i++)
		{
			for (int j=i+1;j<s.length;j++)
			{
				if (s[i]<s[j])
				{
					tmp=s[i];
					s[i]=s[j];
					s[j]=tmp;
				}
			}
		}
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");	
		}
	}

}
