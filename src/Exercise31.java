import java.util.*;
public class Exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scan=new Scanner(System.in);
			int a=scan.nextInt();
			int i=0;
			int[] b=new int[a];
			TreeSet<Integer> noReapted=new TreeSet<Integer>();
			while (i<a)
			{
				b[i]=scan.nextInt();
				i++;
			}
			for (int j=0;j<b.length;j++)
			{
				noReapted.add(b[j]);
			}
			for (int t:noReapted)
			{
				System.out.println(t);
			}
			
	}

}
