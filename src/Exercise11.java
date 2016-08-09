import java.util.Scanner;
public class Exercise11 {
		 public static void main(String[] args) {
			 Scanner scan=new Scanner(System.in);
			 System.out.println("请输入猴子个数");
			 int m=scan.nextInt();
			 scan.close();
			 if(m>=3 && m<=9)
			 {
				 int sum=m;
			 int sum2;
			 int index;
			 boolean flag=true;
			 while (flag)
			 {
				 index=0;
				 sum2=sum;
				 for (int i=1;i<=m;i++)
				 {
					 if ((sum2-1)%m==0)
					 {
						 sum2=(m-1)*(sum2-1)/m;
						 index++;
					 }
					 if (index==m)
					 {
						 System.out.println(sum);
						 flag=false;
						 break;
					 }
				 }
				 sum++;
			 }
			 }
			 else 
				 System.out.println("输入的数量不符合要求");
		 
		}   
}
