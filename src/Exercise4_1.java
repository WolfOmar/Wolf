
public class Exercise4_1 {
	int count_1=0;
	int count_2=0;
		public int zimu(String s)
		{
			char[] a=s.toCharArray();
			for (int i=0;i<a.length;i++)
			{
				if (a[i]=='o')
				{
					count_1=count_1+1;
				}
				if (a[i]=='n')
				{
					count_2=count_2+1;
				}
			}
			return count_1;
		}
}
