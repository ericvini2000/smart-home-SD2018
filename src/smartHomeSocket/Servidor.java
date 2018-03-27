package smartHomeSocket;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;

public class Servidor {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ServerSocket server = new ServerSocket(3000);
		Socket socket = server.accept();
		ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
		ArCondicionado ar = (ArCondicionado) in.readObject();
		System.out.println("Novo condicionador de ar conectado!");
		ar.ligaDesliga();
		ar.setTemp(20);
		ar.printStats();
		out.writeObject(ar);
		out.flush();
		socket.close();
	}
}