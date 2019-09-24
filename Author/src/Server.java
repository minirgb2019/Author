import java.net.*;
import java.io.*;


public class Server{
	public static void main (String [] args) throws IOException{
		ServerSocket ss=new ServerSocket(8888);
		Socket s=ss.accept();
		System.out.println("client connected");

		//one way communication
		InputStreamReader in =new InputStreamReader(s.getInputStream());
		BufferedReader bf= new BufferedReader(in);

		String str=bf.readLine();
		System.out.println("client: "+str);

		//Two way communication (client to server/server to client)
		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println("Min");//pr.println("hello");
		pr.flush();
		ss.close();

	}
}