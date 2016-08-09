import java.net.*;
import java.io.*;
public class Exercise28
{
	 public static void main(String args[]) throws IOException
	 {  
	      //为了简单起见，所有的异常信息都往外抛  
	    int port = 8898;  
	    ServerSocket server = new ServerSocket(port);  
	    while(true)
	    {
	      Socket socket = server.accept();  
	      BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));  
	      String str;
	      while ((str=reader.readLine()) != null)
	      {
	    		  System.out.println(str);  
	      }
	      
	      Writer writer = new OutputStreamWriter(socket.getOutputStream());  
	      writer.write("Hello Client.\n");  
	      writer.flush();  
	      writer.close();  
	      reader.close();  
	      socket.close();  
	      server.close();
	    }
	 }  

}
