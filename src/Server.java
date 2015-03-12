import java.io.*;
import java.net.*;

// A Webserver waits for clients to connect, then starts a separate
// thread to handle the request.
public class Server {
  private static ServerSocket serverSocket;

  public static void main(String[] args) throws IOException {
    serverSocket=new ServerSocket(9696);  // server listen on port 10000
    while (true) {
      try {
    	  System.out.println("Server Listening");
        Socket s=serverSocket.accept();  // Wait for a client to connect
        new Client(s);  
          // close port  
      }
      catch (Exception x) {
    	  
        System.out.println(x);
      }
    }
  }
}


