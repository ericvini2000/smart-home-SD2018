package smartHomeSocket;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;


public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Socket cliente = new Socket("localhost", 3000);
		ObjectOutput out = new ObjectOutputStream(cliente.getOutputStream());
		ObjectInput in = new ObjectInputStream(cliente.getInputStream());
		ArCondicionado ar = new ArCondicionado();
		ar.printStats();
		System.out.println("Enviando ao servidor...");
		System.out.println("-----------");
		System.out.println("-----------");
		System.out.println("-----------");
		out.writeObject(ar);
		out.flush();
		ar = (ArCondicionado) in.readObject();
		ar.printStats();
	}

}
