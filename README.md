import java.io.*;  
import java.net.*;  
import java.util.Scanner;  
public class Server  
    {  
  
        /** 
         * Author:Lip Desc:SSD8_exercise1 
         */  
       public static int PORT = 8000;  
       public static String HOST = "127.0.0.1";  
  
        public static void main(String[] args)  
            {  
                ServerSocket serverSocket = null;  
                Socket socket = null;  
                try  
                    {  
                        serverSocket = new ServerSocket(PORT);  
                        // 等待请求,无请求一直等待  
                        while (true)  
                            {  
                                System.out.println("Waiting Client");  
                                socket = serverSocket.accept();// 接受请求  
                                System.out.println("Client Conect!");  
                              
                                new ThreadedServer(socket);  
                                
                            }  
                    }  
                catch (Exception e)  
                    {  
                        try  
                            {  
                                socket.close();  
                            }  
                        catch (IOException e1)  
                            {  
                                e1.printStackTrace();  
                            }  
                    }  
                /*finally  
                    {  
                       try  
                        {  
                            serverSocket.close();  
                        }  
                    catch (IOException e)  
                        {  
                            e.printStackTrace();  
                        }  
                    }  */
  
            }  
  
    }  
  
public class ThreadedServer extends Thread  
    {  
  
        private Socket socket = null;  
        private BufferedReader br = null;  
        private PrintWriter pw = null;  
        private Scanner scanner = null;  
  
        public ThreadedServer(Socket s)  
            {  
                socket = s;  
                try  
                    {  
                        br = new BufferedReader(new InputStreamReader(  
                                socket.getInputStream()));  
                        pw = new PrintWriter(  
                                new BufferedWriter(new OutputStreamWriter(  
                                        socket.getOutputStream())), true);  
                        scanner = new Scanner(System.in);// 从键盘读取数据  
                        start();  
                    }  
                catch (Exception e)  
                    {  
  
                        e.printStackTrace();  
                    }  
            }  
  
        public void run()  
            {  
                new ReadClientMessage(br, socket);//读取客户端数据  
                while (true)//向客户端发送数据  
                    {  
                        try  
                            {  
                                pw.println(scanner.nextLine());  
                                pw.flush();  
                            }  
                        catch (Exception e)  
                            {  
                                try  
                                    {  
                                        br.close();  
                                        pw.close();  
                                        socket.close();  
                                    }  
                                catch (IOException e1)  
                                    {  
                                        e1.printStackTrace();  
                                    }  
                            }  
                    }  
            }  
  
    }  
  public class ReadClientMessage extends Thread  
    {  
        BufferedReader bReader;  
        Socket socket;  
        public ReadClientMessage(BufferedReader br,Socket s)  
            {  
                this.bReader = br;  
                this.socket=s;  
                start();  
            }  
  
        public void run()  
            {  
                String str = "";  
                while (true)  
                    {  
                        try  
                            {  
                                str = bReader.readLine();  
                                if (str.equals("q"))  
                                    {  
                                      bReader.close();  
                                      socket.close();  
                                      break;  
                                    }  
                            }  
                        catch (IOException e)  
                            {  
                                e.printStackTrace();  
                            }  
                        System.out.println("Client Message:" + str);  
                    }  
            }  
    }  
