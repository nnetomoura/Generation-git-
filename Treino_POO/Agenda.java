package Treino_POO;

import java.util.ArrayList;
import java.util.List;

public class Agenda { //v�rios contatos que vir�o da classe contato (atrav�s de lista)
	
	private String nomeAgenda;
		
	List<Contato> contatos = new ArrayList<Contato>();
	
	//m�todo construtor
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
