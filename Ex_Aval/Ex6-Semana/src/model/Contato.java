package model;

public class Contato implements ICoisa{
	private String nome;
	private String email;
	private ArrayConjunto telefones;
	
	//Telefone é uma classe
	public Contato(String nome, String email, Telefone telefone) {
		setEmail(email);
		setNome(nome);
		
		//O atributo telefones recebe a referência para um objeto ArrayConjunto. 
		//O new ArrayConjuntos significa a chamada do construtor do objeto ArrayConjunto
		//Ou seja, ArrayConjunto não é um grande array pra aplicação toda,
		//mas sim uma estrutura genérica que pode ser usada onde for necessária 
		telefones = new ArrayConjunto(2); 
		telefones.add(telefone); //adiciono um objeto do tipo telefone nesse array
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}

	public ArrayConjunto getTelefones() {
		return telefones;
	}
	
	//Caso queira adicionar um novo telefone, recebo um objeto do tipo telefone e
	//passo esse objeto para o método add da classe ArrayConjunto 
	public boolean novoTelefone(Telefone telefone) { //caso
		return telefones.add(telefone);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Nome: ");
		sb.append(getNome().toUpperCase());
		sb.append("\nE-mail: ");
		sb.append(getEmail());
		sb.append("\nTelefones: ");
		
		//telefones.size retorna a quantidade de objetos presentes no ArrayConjunto de telefones
		//nesse conjunto de código eu pego todos os telefones
		for(int i=0; i<telefones.size(); i++) {
			sb.append(telefones.get(i).toString());
			if(i+1 < telefones.size()) {
				sb.append(" | ");
			}
		}
		return sb.toString();
	}
}
