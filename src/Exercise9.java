
/*程序实现目标：求一个整型数组中元素的平均值，并统计其中大于和小于此平均值的元素的个数。
  程序要求：输入：整型数组中的元素个数及各个元素。
                     输出：整型数组中元素的平均值，大于和小于此平均值的元素的个数。
*/
public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double start=System.currentTimeMillis();
		int[] a=new int[10];
		int sum=0;
		int avg=0;
		int count_upper=0;
		int count_lower=0;
		for (int i=0;i<10;i++)
		{
			a[i]=i+1;
		}
		for (int i=0;i<10;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/10;
		for (int i=0;i<10;i++)
		{
			if (a[i]>avg)
			{
				count_upper++;
			}
			else if (a[i]<avg)
			{
				count_lower++;
			}
		}
		double end=System.currentTimeMillis();
		System.out.println("平均值为："+avg+" 大于平均值个数为："+count_upper+" 小于平均值个数为："+count_lower);
		System.out.println("运行的时间为："+(end-start));
	}

}
