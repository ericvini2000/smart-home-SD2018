package smartHomeSocket;

import java.io.Serializable;

public class Lampada implements Serializable {

	private static int idAux = 0;
	private int id;
	private boolean isOn;
	
	Lampada(){
		this.id = idAux;
		idAux++;
		this.isOn = false;
	}
	
	public int getID() {
		return this.id;
	}
	
	public boolean isOn() {
		return this.isOn;
	}
		
	public void ligaDesliga() {
		if(this.isOn()) {
			this.isOn = false;
		} else {
			this.isOn = true;
		}
	}
	
	public void printStats() {
		String stats;
		if(this.isOn == true) {
			stats = "Ligada";
		} else {
			stats = "Desligada";
		}
		System.out.println("--- Lampada ---");
		System.out.print("ID: " + this.id + "\t");
		System.out.println("Status atual: " + stats);
	}
}