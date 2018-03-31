package smartHomeSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.ServerSocket;

public class Servidor {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SocketException {
		ServerSocket server = new ServerSocket(3000);
		Socket socket = server.accept();
		System.out.println("Servidor inicializado na porta 3000!");
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
		Casa c = (Casa) in.readObject();
		System.out.println("Casa registrada!");
		c.getAr().ligaDesliga();
		c.getAr().setTemp(20);
		c.getGela().ligaDesliga();
		c.getGela().setTemp(8);
		c.getTV().ligaDesliga();
		c.getTV().mudaCanal(3);
		out.writeObject(c);
		out.flush();
		socket.close();
	}
}