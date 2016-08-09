import java.util.*;
public class Exercise_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		while (scan.hasNext())
		{
			String[] str_1=scan.nextLine().split(" ");
			String[] str_2=scan.nextLine().split(" ");
	
			int[] a=new int[str_1.length];
	
			for (int i=0;i<str_1.length;i++)
			{
				a[i]=Integer.parseInt(str_1[i]);
			}
			int[] b=new int[str_2.length];
			for (int i=0;i<str_2.length;i++)
			{
				b[i]=Integer.parseInt(str_2[i]);
			}
			
			
			
			for (int j=0;j<a[0];j++)
			{
				if (a[1]>=b[j])
				{
					a[1]=a[1]+b[j];
				}
				else if (a[1]<b[j])
				{
					a[1]=a[1]+Gongyueshu(b[j],a[1]);
				}
			}
			
			System.out.println(a[1]);
	      
		}
		  scan.close();
	}
	
	public static int Gongyueshu(int a,int b)
	{
		while (a%b!=0)
		{
			int tmp=a%b;
			a=b;
			b=tmp;
		}
		return b;
	}

}
