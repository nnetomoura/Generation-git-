package Treino_POO;

import java.util.Scanner;

public class TesteAgenda {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		Agenda agenda = new Agenda();
		System.out.println("Insira o nome da agenda: ");
		agenda.setNomeAgenda(ler.nextLine()); 
		//inserindo o nome direto através do set acima
		System.out.println("Nome da agenda: " + agenda.getNomeAgenda());
		System.out.println("\nQuantos contatos você deseja adicionar? ");
		int x = ler.nextInt();
		ler.nextLine();
		int cont=0;
		do  
		{
			System.out.println("\nInsira o nome do " + (cont+1) + "º contato: " );
			String nome = ler.nextLine(); 
			System.out.println("\nInsira o email do " + (cont+1) + "º contato: " );
			String email = ler.nextLine();
			System.out.println("\nInsira o número do " + (cont+1) + "º contato: " );
			String telefone = ler.nextLine();
			
			Contato contato = new Contato(nome, telefone, email);
			agenda.getContatos().add(contato); //em listas não usamos o método set!
			cont++;
		
		}while(cont<x);
			
			for(Contato contato: agenda.getContatos()) //para cada contato da minha agenda, printe o nome; for each
			{
				System.out.println("\nNome:" + contato.getNomeContato() + 
						"\nEmail: " + contato.getEmail() +
						"\nNúmero: " + contato.getTelefone());
			}
		ler.close();
		
	}

}
