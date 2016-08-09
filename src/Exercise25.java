import java.util.*;
public class Exercise25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scan=new Scanner(System.in);
     int b=scan.nextInt();
     scan.close();
     if (b>=1 && b<=65535)
     {
    	 Main(b);
     }
     else
     {
    	 System.out.println("输入的数值超出范围");
    	 
     }
     
	}
		public static void Main(int n)
		{
			int count=0;
			int[] a=new int[n];
			for (int j=1;j<=n;j++)
			{
				for (int i=1;i<=n;i++)
				{
					if(j%i==0)
					{
						a[j-1]=a[j-1]+1;
					}
				}
			}
			for (int i=0;i<n;i++)
			{
				if (a[i]%2==1)
				{
					count++;
				}
			}
			System.out.println(count);
		}
}
