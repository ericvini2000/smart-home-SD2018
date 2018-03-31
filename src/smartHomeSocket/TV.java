package smartHomeSocket;

import java.io.Serializable;

public class TV implements Serializable{
	
	private static int idAux = 0;
	private int id;
	private boolean isOn;
	private int ch;
	
	TV(){
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
			this.ch = 10;
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
		System.out.println("--- Televisor ---");
		System.out.print("ID: " + this.id + "\t");
		System.out.println("Status atual: " + stats);
	}
	
	public void mudaCanal(int ch) {
		if(this.isOn()) {
			System.out.println("Mudando para o canal " + ch);
			this.ch = ch;
		} else {
			System.out.println("Televisor desligado.");
		}
	}
}