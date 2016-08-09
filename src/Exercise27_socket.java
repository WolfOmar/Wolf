import java.lang.*;
import java.io.*;
import java.net.*;
public class Exercise27_socket extends Thread 
{
	BufferedReader buf;
	Socket s;
		public Exercise27_socket(Socket sb)
		{
			this.s=sb;
			try 
			{
				 buf=new BufferedReader(new InputStreamReader(s.getInputStream()));
				start();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void run() 
		{	
			String str="";
			while(true)
			{
				
			try 
			{
				str=buf.readLine();
				buf.close();
				s.close();
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(str);
		}
			
	}
}
