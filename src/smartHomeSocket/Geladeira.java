package smartHomeSocket;

import java.io.Serializable;
import java.util.ArrayList;

public class Geladeira implements Serializable {
	
	private static int idAux = 0;
	private int id;
	private int temperatura;
	private boolean isOn;
	private ArrayList<String> itens; 

	Geladeira(){
		this.id = idAux;
		idAux++;
		this.temperatura = 10;
		itens = new ArrayList<String>(20);
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
		if(temperatura <= 4) {
			System.out.println("Temperatura abaixo do mínimo recomendável (6)");
		} else if(temperatura >= 11) {
			System.out.println("Temperatura acima do máximo recomendável (10)");
		}
		this.temperatura = temperatura;
		System.out.println("Temperatura alterada. Temperatura atual: " + this.temperatura);
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
		System.out.println("--- Geladeira ---");
		System.out.print("ID: " + this.id + "\t");
		System.out.println("Status atual: " + stats);
		System.out.println("Temperatura atual: " + this.temperatura);
	}
	
	public void printItens() {
		for(int i = 0; i < itens.size(); i++) {
			System.out.println(itens);
		}
	}
	
	public void insertItem(String item) {
		this.itens.add(item);
	}
	
	public void removeItem(String item) {
		this.itens.remove(itens.indexOf(item));
	}
}
