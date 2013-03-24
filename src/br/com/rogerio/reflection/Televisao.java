package br.com.rogerio.reflection;

public class Televisao {

	private boolean liga;
	private boolean desliga;
	private int canal;
	
	
	public void ligar(){
		liga = true;
		System.out.println("tv ligada");
	}
	
	
	public void desligar(){
		System.out.println("tv desligada");
	}
	
	
	public void mudarCanal(int canal){
		this.canal = canal;
		System.out.println("canal: "+ canal);
	}
}
