
public class Exercise14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise14 s=new Exercise14();
		int l1=5;
		int l2=9;
		int[] array11={4,12,3,3,8};
		int[] array22={1,2,4,24,455,66,33,33,8};
		System.out.println(s.array_compare(l1,array11,l2,array22));
		//s.array_compare(l1,array11,l2,array22);
	}
	public int array_compare(int len1,int array1[],int len2,int array2[])
	{
		int count=0;
		if(array1.length<array2.length)
		{
			int j=0;
			int k=0;
			int[] array3=new int[array1.length];
			int[] array4=new int[array1.length];
			for (int i=array2.length-1;i>=array2.length-array1.length;i--)
		{
			
			array3[j]=array2[i];
			    j++;
			
		}
			for (int i=array1.length-1;i>=0;i--)
			{
				array4[k]=array1[i];
				k++;
			}
			for (int i=0;i<array1.length;i++)
			{
				if (array3[i]!=array4[i])
				{
					count++;
				}
			}
			
		}
		else if (array1.length>array2.length)
		{
			int j=0;
			int k=0;
			int[] array3=new int[array2.length];
			int[] array4=new int[array2.length];
			for (int i=array1.length-1;i>=array1.length-array2.length;i--)
		{
			array3[j]=array1[i];
			j++;
			
		}
			for (int i=array2.length-1;i>=0;i--)
			{
				array4[k]=array2[i];
				k++;
			}
			for (int i=0;i<array2.length;i++)
			{
				if (array3[i]!=array4[i])
				{
					count++;
				}
			}
		}
			
		else if (array1.length==array2.length)
		{
			for (int i=0;i<array2.length;i++)
			{
				if (array1[i]!=array2[i])
				{
					count++;
				}
			}
		}
		return count;
	}

}
