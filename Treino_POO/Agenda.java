package Treino_POO;

import java.util.ArrayList;
import java.util.List;

public class Agenda { //vários contatos que virão da classe contato (através de lista)
	
	private String nomeAgenda;
		
	List<Contato> contatos = new ArrayList<Contato>();
	
	//método construtor
	public Agenda() { //vazio msm
	}
	
	public Agenda(String nomeAgenda) {
	this.nomeAgenda = nomeAgenda;
			
	}

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	
	
	

	
	

	
}
