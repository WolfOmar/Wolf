import java.util.Scanner;
public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入若干个非负整数，各个数之间用一个空格分开：");
			String str=scan.nextLine();
			String[] str_1=str.split(" ");
			Data(str_1);
			
	}
	public static void Data(String[] s)
	{
		int[] a=new int[s.length];
		for (int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);//转换成整型数组
		}
			java.util.Arrays.sort(a);//先进行排序
			
		StringBuffer buf_1=new StringBuffer();
		for (int j=a.length-1;j>=0;j--)
		{
			if (a[j]%2==1)//奇数排序
			{
				buf_1.append(a[j]).append(" ");

			}
		}
		
		StringBuffer buf_2=new StringBuffer();
		for (int j=0;j<a.length;j++)
		{
			if (a[j]%2==0)//偶数排序
			{
				buf_2.append(a[j]).append(" ");

			}
		}
		StringBuffer buf_3=new StringBuffer();
		buf_3.append(buf_1).append(buf_2);
		System.out.println(buf_3.toString());
	}

}
