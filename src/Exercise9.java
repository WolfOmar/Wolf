
/*����ʵ��Ŀ�꣺��һ������������Ԫ�ص�ƽ��ֵ����ͳ�����д��ں�С�ڴ�ƽ��ֵ��Ԫ�صĸ�����
  ����Ҫ�����룺���������е�Ԫ�ظ���������Ԫ�ء�
                     ���������������Ԫ�ص�ƽ��ֵ�����ں�С�ڴ�ƽ��ֵ��Ԫ�صĸ�����
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
		System.out.println("ƽ��ֵΪ��"+avg+" ����ƽ��ֵ����Ϊ��"+count_upper+" С��ƽ��ֵ����Ϊ��"+count_lower);
		System.out.println("���е�ʱ��Ϊ��"+(end-start));
	}

}
