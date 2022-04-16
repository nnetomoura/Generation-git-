package Treino_POO1;

public class Lampada {
	
	protected String ligado;
	protected String desligado;
	
	public Lampada() {
		
	}
	
	public Lampada(String ligado, String desligado) {
		this.ligado = ligado;
		this.desligado=desligado;
	}

	public String getLigado() {
		return ligado;
	}

	public void setLigado(String ligado) {
		this.ligado = ligado;
	}

	public String getDesligado() {
		return desligado;
	}

	public void setDesligado(String desligado) {
		this.desligado = desligado;
	}
	
	public void ligarLampada() {
		System.out.println("\nLÂMPADA LIGADA!");
		
	}
	
	public void desligarLampada() 
	{
		System.out.println("\nLÂMPADA DESLIGADA!");
	}
	

}
