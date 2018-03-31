package smartHomeSocket;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class Cliente {

	public static void main(String[] args) throws EOFException, UnknownHostException, IOException, ClassNotFoundException {
		Socket cliente = new Socket("localhost", 3000);
		ObjectOutput out = new ObjectOutputStream(cliente.getOutputStream());
		ObjectInput in = new ObjectInputStream(cliente.getInputStream());
		Casa c = new Casa();
		c.printCasa();
		System.out.println("Enviando ao servidor...");
		out.writeObject(c);
		out.flush();
		c = (Casa) in.readObject();
		c.printCasa();
	}
}
