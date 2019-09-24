import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client{
	public static void main (String [] args) throws IOException{
		Socket s=new Socket("localhost", 8888);

		//one way communication
		PrintWriter pr=new PrintWriter(s.getOutputStream());
		pr.println("author");
		pr.flush();

		//Two way communication (client to server/server to client)
		InputStreamReader in =new InputStreamReader(s.getInputStream());
		BufferedReader bf= new BufferedReader(in);

		String str=bf.readLine();
		System.out.println("server: "+str);
		s.close();
	}
	
}