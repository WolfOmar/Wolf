
public class Exercise2 {

	public static void main(String[] args) {
		int temp=0;
		// TODO Auto-generated method stub
			int[] s=new int[10];
			for (int i=0;i<10;i++)
			{
				s[i]=i;
				System.out.print(s[i]+" ");
							}
			
			
			for (int i=0;i<s.length/2;i++)
			{
				temp=s[i];
				s[i]=s[s.length-1-i];
				s[s.length-1-i]=temp;
			}
			System.out.println("\n******************");
			for (int x:s)
			{
				System.out.print(x+" ");
			}
	}

}
