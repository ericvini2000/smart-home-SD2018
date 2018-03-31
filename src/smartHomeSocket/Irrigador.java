package smartHomeSocket;

import java.io.Serializable;

public class Irrigador implements Serializable {
	
	private static int idAux = 0;
	private int id;
	private boolean isOn;
	private int vel;
	
	Irrigador(){
		this.id = idAux;
		idAux++;
		this.isOn = false;
		this.vel = 0;
	}
	
	public int getID() {
		return this.id;
	}
	
	public boolean isOn() {
		return this.isOn;
	}
	
	public int getVel() {
		return this.vel;
	}
	
	public void setVel(int vel) {
		if(this.isOn()) {
			if(vel > 3) {
				System.out.println("Por favor, selecione uma velocidade entre 1-3.");
			} else {
				this.vel = vel;
			}
		} else {
			System.out.println("Irrigador de ID " + this.id + " desligado.");
		}
		System.out.println("Velocidade atual: " + this.vel);
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
			stats = "Ligado";
		} else {
			stats = "Desligado";
		}
		System.out.println("--- Irrigador ---");
		System.out.print("ID: " + this.id + "\t");
		System.out.println("Status atual: " + stats);
	}
}