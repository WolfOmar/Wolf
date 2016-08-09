import java.util.*;
public class Zouke {

	public static void main(String[] args)
	{
		Thread t=new Thread();
		int[] a=new int[3];
		int max=0;
		// TODO Auto-generated method stub
		for (int i=0;i<=2;i++)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("请输入一个整数");
			a[i]=s.nextInt();
		}
		for (int i=1;i<=3;i++)
		{
			if (max<=a[i-1])
				max=a[i-1];
		}
		System.out.println("最大值是："+max);
		//System.out.println(5.98+7.54+"zouke"+3.45+3.67);
	}

}
