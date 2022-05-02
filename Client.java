import java.io.DataInputStream;
import java.net.Socket;

public class Client {
    public static void main(String []args) throws Exception {
        Socket socket = new Socket("localhost",8888);
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        System.out.println(inputStream.readUTF());
    }
}

