import java.util.Scanner;
public class Exercise19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			System.out.println("���������ɸ��Ǹ�������������֮����һ���ո�ֿ���");
			String str=scan.nextLine();
			String[] str_1=str.split(" ");
			Data(str_1);
			
	}
	public static void Data(String[] s)
	{
		int[] a=new int[s.length];
		for (int i=0;i<s.length;i++)
		{
			a[i]=Integer.parseInt(s[i]);//ת������������
		}
			java.util.Arrays.sort(a);//�Ƚ�������
			
		StringBuffer buf_1=new StringBuffer();
		for (int j=a.length-1;j>=0;j--)
		{
			if (a[j]%2==1)//��������
			{
				buf_1.append(a[j]).append(" ");

			}
		}
		
		StringBuffer buf_2=new StringBuffer();
		for (int j=0;j<a.length;j++)
		{
			if (a[j]%2==0)//ż������
			{
				buf_2.append(a[j]).append(" ");

			}
		}
		StringBuffer buf_3=new StringBuffer();
		buf_3.append(buf_1).append(buf_2);
		System.out.println(buf_3.toString());
	}

}
