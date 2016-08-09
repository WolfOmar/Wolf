
public class Exercise13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=232334;
		int i=1;
		boolean flag=true;
		while(flag)
		{
			if(i<=7)
		   {	
			StringBuffer s=new StringBuffer();
			s.append(a);
			String str=s.reverse().toString();
			int b=Integer.parseInt(str);
			int c=b+a;
			StringBuffer s2=new StringBuffer();
			s2.append(c);
			String str2=s2.reverse().toString();
			int d=Integer.parseInt(str2);
				if (c==d)
				{
					System.out.println(c);
					flag=false;
					break;
				}
				else
				  a=c;
				 i++;
			}
			
			System.out.println(0);
		}
	}

}
