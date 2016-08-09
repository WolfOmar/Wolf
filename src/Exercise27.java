import java.io.IOException;
import java.net.*;

public class Exercise27 {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		    int port=4135;
			ServerSocket s_socket= new ServerSocket(port);
				while(true)
				{
					Socket socket=s_socket.accept(); 
					System.out.println("连接成功");
				   new Exercise27_socket(socket);
				}
															
                   // socket.close();  
               
			
					//s_socket.close();
		
				
				
			
	}

}
