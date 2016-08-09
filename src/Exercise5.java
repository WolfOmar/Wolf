import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
public class Exercise5 {

	public static void main(String[] args) throws Exception
	{
		//int a=10;
		// TODO Auto-generated method stub
			File f=new File("d:"+File.separator+"test1.txt");
			InputStream input=new FileInputStream(f);
			//String str="·Ç³£ºÃ£¡";
			byte b[]=new byte[1024];
			input.read(b);
			input.close();
			//out.write(b);
			//out.close();
			
			//System.out.print(String.valueOf(b));
			//String str=new String(a);
			//Integer d=new Integer(a);
			
			System.out.print(new String(b));
			
	}

}
