
import java.util.*;
public class Exercise34
    {
    public static void main(String[] args)
        {
        Scanner scan=new Scanner(System.in);
        String str_1=scan.nextLine();
        String str_2=scan.nextLine();
        Data(str_1);
        Data(str_2);
    }
    public static void Data(String str)
        {
    	if (str.length()>0)
    	{
        StringBuffer buf=new StringBuffer();
        if (str.length()<8)
            {
            buf.append(str);
            int count=8-str.length();
            for (int i=0;i<count;i++)
                {
                buf.append(0);
			}
            System.out.println(buf);
        }
        if (str.length()==8)
            {
            buf.append(str);
            System.out.println(buf);
        }
        if (str.length()>8)
            {
            int a=(int)(str.length()/8);
            int b=str.length()%8;
            int c=8-b;
            int number=0;
            for(int i=0;i<a*8;i++)
                {
                buf.append(str.charAt(i));
                number++;
                if (number==8)
                    {
                    buf.append("\n");
                    number=0;
                }
            }
            for (int j=a*8;j<str.length();j++)
                {
                buf.append(str.charAt(j));
            }
            for (int k=0;k<c;k++)
                {
                buf.append(0);
            }
             System.out.println(buf);
        }
    }
    }
}