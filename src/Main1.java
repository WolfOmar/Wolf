import java.util.*;
public class Main1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String str=String.valueOf(Integer.toBinaryString(a));
        int count=0;
        for (int i=0;i<str.length();i++)
            {
            if(str.charAt(i)=='1')
                {
                count++;
            }
        }
        System.out.println(count);
    }
}
	
