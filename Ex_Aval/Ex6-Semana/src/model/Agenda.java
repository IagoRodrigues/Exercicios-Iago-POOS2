package model;

public class Agenda {
	private ArrayConjunto contatos;
	
	//Contrutor: quando chamado cria uma agenda do tipo ArrayConjunto
	public Agenda() {
		contatos = new ArrayConjunto();
	}
	
	//Para inserir um contato só passo o contato pra add;
	public boolean insereContato(Contato contato) {
		return contatos.add(contato);
	}
	
	//Para limpar a lista
	public void limpaLista() {
		contatos.clear();
	}
	
	//Para excluir um contatocom base em sua posição
	public void removePosicao(int posicao) {
		contatos.remove(posicao);
	}
	
	public String listaContatos() {
		StringBuilder sb = new StringBuilder();
		
		//contatos.size retorna a quantidade de objetos presentes no ArrayConjunto de contatos
		//nesse conjunto de código eu pego todos os contatos
		for(int i=0; i<contatos.size(); i++) {
			sb.append("-----------\n");
			sb.append(contatos.get(i).toString());
			sb.append("\n");
		}
		return sb.toString();
	}
}