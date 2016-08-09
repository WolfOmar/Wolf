import java.net.*;
import java.io.*;
public class Exercise28_2 {  
  
   public static void main(String args[]) throws Exception {  
     String host = "10.140.184.189";  
     int port = 8898;  
     Socket client = new Socket(host, port);  
     Writer writer = new OutputStreamWriter(client.getOutputStream());  
      writer.write("Hello Server.\n");  
      writer.flush();  
     BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));  
      String str=reader.readLine();  
      System.out.println(str);
      if (str != null) 
      {  
         
         System.out.println("from server: " + str);  
      }  
     
      writer.close();  
      reader.close();  
      //client.close();  
   }  
}  