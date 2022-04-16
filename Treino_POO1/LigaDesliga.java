package Treino_POO1;

import java.util.Scanner;

public class LigaDesliga {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Olá! Com a Alexa JAVA você pode controlar "
				+ "a sua lâmpada com apenas um botão!");
		
		int x;
		do {
			
			System.out.println("\nSelecione a opção desejada para ligar a lâmpada: "
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
				System.out.println("ATENÇÃO: Entrada inválida!!!");
			}
			
			
		}while(x<0||x>2);
		
		ler.close(); //fechando objeto ler (Scanner)
	}

}
