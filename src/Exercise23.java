
public class Exercise23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] b={4,6,3,3,9};
			Data(b);
	}
		public static void Data(int[] a)
		{
			java.util.Arrays.sort(a);
			int count=0;
			int num=0;
			StringBuffer buf= new StringBuffer();
			
			for (int i=0;i<=9;i++)
			{
				for (int j=0;j<a.length;j++)
				{
					if (a[j]==count)
				   {
					     break;
					  
				   }
					else
					{
						num++;
					}
					
			    }
				if (num==a.length)
				{
					count++;
					num=0;
				}
				else
				{
				 buf.append(count).append(" ");
				 count++;
				num=0;
				}
			}
			System.out.println(buf.toString());
		}
}
