
public class Exercise24{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] b={4,6,3,3,9};
			Data(b);
	}
		public static void Data(int[] a)
		{
			java.util.Arrays.sort(a);
			int count=0;
			StringBuffer buf= new StringBuffer();
			
			for (int i=0;i<=9;i++)
			{
				for (int j=0;j<a.length;j++)
				{
					if (a[j]==count)
				   {
						 buf.append(count).append(" ");
					     break;
					  
				   }
					
					
				}
				
					count++;
			}
			System.out.println(buf.toString());
		}
}
