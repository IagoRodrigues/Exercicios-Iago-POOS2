package view;

import model.Agenda;
import model.Contato;
import model.Telefone;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		//Contato contato;
		
		
		agenda.insereContato(new Contato("Ednilson", "ednilson@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Iago", "rossi@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Pri", "lalala@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Teste1", "hahaha@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		agenda.insereContato(new Contato("Teste2", "kakaka@ifsp.edu.br", new Telefone(016, 3303, 2330)));
		
		System.out.println(agenda.listaContatos());
		
		agenda.removePosicao(2);
		
		System.out.println(agenda.listaContatos());
		
		agenda.limpaLista();
		
		System.out.println(agenda.listaContatos());
	}

}

