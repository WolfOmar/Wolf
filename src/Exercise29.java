import java.util.*;
public class Exercise29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		String str_1=scan.nextLine();
		System.out.println("������ڶ����ַ���");
		String str_2=scan.nextLine();
		int a=0;
		int b=compare(str_1,str_2,a);
		System.out.println(b);
	}
	public static int compare(String str1,String str2,int start){
	    if(start<0)return 0;
	    if(str1==null || str2==null)return 0;
	    int len=str1.length()>str2.length()?str2.length():str1.length();
	    if(start>=len)return 0;
	    char c1,c2;
	    int okLen=0;
	    for(int i=start;i<len;i++){
	        c1=str1.charAt(i);
	        c2=str2.charAt(i);
	        if(c1==c2){
	            okLen++;
	        }else{
	            okLen=0;
	        }
	    }
	    return okLen;
	}
}
