package Treino_POO1;

import java.util.Scanner;

public class LigaDesliga {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Ol�! Com a Alexa JAVA voc� pode controlar "
				+ "a sua l�mpada com apenas um bot�o!");
		
		int x;
		do {
			
			System.out.println("\nSelecione a op��o desejada para ligar a l�mpada: "
					+ "Tecle 1 para LIGAR e 2 para DESLIGAR!");
			x = ler.nextInt();
			
			if (x==1)
			{
				lampada.ligarLampada(); 	
				
			}
			else if (x==2) 
			{
				lampada.desligarLampada();
			}
			else {
				System.out.println("ATEN��O: Entrada inv�lida!!!");
			}
			
			
		}while(x<0||x>2);
		
		ler.close(); //fechando objeto ler (Scanner)
	}

}
