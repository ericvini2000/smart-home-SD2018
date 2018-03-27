package smartHomeSocket;

import java.io.Serializable;

public class ArCondicionado implements Serializable {
	
	private static int idAux = 0;
	private int id;
	private int temperatura;
	private boolean isOn;
	
	ArCondicionado(){
		this.id = idAux;
		idAux++;
		this.temperatura = 24;
		this.isOn = false;
	}
	
	public int getID() {
		return this.id;
	}
	
	public int getTemp() {
		return this.temperatura;
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public void setTemp(int temperatura) {
		this.temperatura = temperatura;
	}
	
	public void ligaDesliga() {
		if(this.isOn == true) {
			this.isOn = false;
		} else {
			this.isOn = true;
		}
	}
	
	public void printStats() {
		String stats;
		if(this.isOn == true) {
			stats = "Ligado";
		} else {
			stats = "Desligado";
		}
		System.out.println("--- Aparelho Condicionador de Ar ---");
		System.out.print("ID: " + this.id + "\t");
		System.out.println("Status atual: " + stats);
		System.out.println("Temperatura atual: " + this.temperatura);
	}
}
