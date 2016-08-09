import java.util.*;
public class Exercise18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		int[] b=new int[10];
		for (int i=0;i<10;i++)
		{
			b[i]=random.nextInt(10);
		}
		System.out.println(sort(b));
	}
	public static String sort(int[] a)
	{
		StringBuffer buf=new StringBuffer();
		java.util.Arrays.sort(a);
		for (int i=a.length-1;i>=a.length-3;i--)
		{
			buf.append(a[i]);
		}
		return buf.toString();
	}

}
