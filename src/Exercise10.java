import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÌìÊı£º");
		int m=scan.nextInt();
		scan.close();
		int Re_num=1;
		int sum=0;
		for (int i=1;i<=m;i++)
		{
			sum=(Re_num+1)*2;
			Re_num=sum;
		}
		System.out.println(sum);
	}

}
