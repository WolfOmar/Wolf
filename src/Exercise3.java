import java.util.Random;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		//int count=0;
		int count_1=0;
		int count_2=0;
		int count_3=0;
		int count_4=0;
		int count_5=0;
		int count_6=0;
		int count_7=0;
		int count_8=0;
		int count_9=0;
		int count_10=0;
		int[] s=new int[30];
		
		for (int i=0;i<30;i++)
		{
			s[i]=rand.nextInt(9);
		}
		for (int x:s)
		{
			System.out.print(x+" ");
		}
		for (int i=0;i<30;i++)
		{
			if (s[i]==0)
			{
				count_1=count_1+1;
			}
			if (s[i]==1)
			{
				count_2=count_2+1;
			}
			if (s[i]==2)
			{
				count_3=count_3+1;
			}
			if (s[i]==3)
			{
				count_4=count_4+1;
			}
			if (s[i]==4)
			{
				count_5=count_5+1;
			}
			if (s[i]==5)
			{
				count_6=count_6+1;
			}
			if (s[i]==6)
			{
				count_7=count_7+1;
			}
			if (s[i]==7)
			{
				count_8=count_8+1;
			}
			if (s[i]==8)
			{
				count_9=count_9+1;
			}
			if (s[i]==9)
			{
				count_10=count_10+1;
			}
		}
		System.out.println("\n-----------------");
		System.out.println("0的个数有："+count_1+"\n"+"1的个数有:"+count_2);
	}

}
