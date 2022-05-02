import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static int numberOfClients = 0;
    public static void main(String[] args) throws IOException {
        new Thread(()->{
            try{
                ServerSocket serverSocket = new ServerSocket(8888);
                while(true){
                    Socket socket = serverSocket.accept();
                    System.out.println("Starting thread "+numberOfClients);
                    System.out.println("Client IP / 127.0.0.1");
                    numberOfClients++;
                    DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
                    outputStream.writeUTF("You are visitor "+numberOfClients);
                }
            }catch (Exception e){}
        }).start();
    }
}