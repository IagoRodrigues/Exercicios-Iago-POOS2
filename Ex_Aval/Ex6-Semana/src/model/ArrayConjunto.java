package model;

public class ArrayConjunto implements IConjunto {
	private final int tamanhoPadrao = 20;
	private ICoisa dados[];
	private int tamanhoMaximo;
	private int qtdElementos;
	
	//Esse m�todo � o construtor
	//Se eu chamar o construtor sem passar valores, assume o tamanho padr�o
	public ArrayConjunto() {
		this.tamanhoMaximo = tamanhoPadrao;
		init();
	}
	
	//Esse m�todo � uma sobrecarga ao construtor
	//Se eu passar um valor valido para ser o tamanho do conjunto
	//assume esse valor. Se o valor for inv�lido assume o tamanho padr�o
	public ArrayConjunto(int tam) {
		if(tam > 0) {
			this.tamanhoMaximo = tam;
		}else {
			this.tamanhoMaximo = tamanhoPadrao;
		}
		init();
	}
	
	//O construtor chama esse m�todo para inicializa a vari�vel qtdElementos
	//e para criar um novo objeto do tipo ICoisa.
	private void init() {
		this.qtdElementos = 0;
		this.dados = new ICoisa[this.tamanhoMaximo];
	}
	
	//Esse m�todo recebe alguma coisa e adiciona no conjunto:
	//Recebo uma coisa, se ela n�o for nula e ainda tiver espa�o no array,
	//adiciono essa coisa e digo que o conjunto tem mais um elemento;
	@Override
	public boolean add(ICoisa coisa) {
		boolean deuCerto = false;
		
		if(coisa != null) {
			if(this.qtdElementos == this.tamanhoMaximo) {
				dobraTamanho();
			}
			dados[qtdElementos] = coisa;
			qtdElementos++;
			deuCerto = true;
		}
		
		return deuCerto;
	}
	
	//Esse metodo limpa o conjunto
	//Atribui null a todas as posi��es e zera a quantidade de elementos
	@Override
	public void clear() {
		for(int i=0; i<qtdElementos; i++) {
			dados[i] = null;
		}
		qtdElementos = 0;
	}
	
	//Esse m�todo verifica se uma coisa est� ou n�o no conjunto
	//busca objetos pelo array e se encontrar retorna verdadeiro
	@Override
	public boolean contains(ICoisa coisa) {
		boolean achei = false;
		int i = 0;
		
		do {
			achei = dados[i].equals(coisa);
			i++;
		}while(i<qtdElementos && !achei);
				
		return achei;
	}
	
	//Esse m�todo retorna a coisa de uma posi��o espec�fica
	@Override
	public ICoisa get(int posicao) {
		ICoisa coisa = null;
		
		if(posicao >= 0 && posicao < qtdElementos) {
			coisa = dados[posicao];
		}
		
		return coisa;
	}
	
	//Esse m�todo confere se existem elementos dentro do conjunto
	@Override
	public boolean isEmpty() {
		boolean vazio = false;
		
		if(qtdElementos == 0) {
			vazio = true;
		}
		return vazio;
	}

	//Este m�todo remove a coisa que est� na posi��o indicada
	//Confere se a posi��o � v�lida, se for
	//pega a coisa que est� naquela posi��o e sobreescreve aquela posi��o com o resto do vetor
	//subtrai um elemento
	//retorna a coisa eliminada
	@Override
	public ICoisa remove(int posicao) {
		ICoisa coisa = null;
		
		if(posicao >= 0 && posicao <= qtdElementos) {
			
			coisa = dados[posicao];
			
			for(int i=posicao; i<qtdElementos-1; i++) {
				dados[i] = dados[i+1];
			}
			qtdElementos--;
		}
		return coisa;
	}
	
	//Este m�todo remove a primeira ocorrencia da coisa indicada
	@Override
	public boolean remove(ICoisa coisa) {
		boolean deuCerto = false;
		boolean achei = false;
		int i=0;
		int posicao=0;
		
		while(achei == false && i<qtdElementos) {
			achei = dados[i].equals(coisa);
			i++;
		}
		
		posicao = i-1;
		
		for(int j=posicao; j<qtdElementos-1; j++) {
			dados[j] = dados[j+1];
		}
		qtdElementos--;
		
		return deuCerto;
	}

	//Esse m�todo retorna a quantidade de elementos do conjunto
	@Override
	public int size() {
		return this.qtdElementos;
	}
	
	//Esse m�todo dobra o tamanho do array caso aja
	//inser��o em array cheio.
	//primeiro criamos um array novo com o dobro do tamanho do primeiro array
	//depois atribuimos todas as coisas de um para outro
	//setamos o tamanho m�ximo = 2*tamanhoMaximo
	//sobrescrevemos o novo array sobre o antigo
	private void dobraTamanho(){
		ICoisa novoArray[] = new ICoisa[tamanhoMaximo * 2];
		
		for(int i=0; i<this.tamanhoMaximo; i++) {
			novoArray[i] = dados[i];
		}
		
		this.tamanhoMaximo *= 2;
		this.dados = novoArray;
	}
}
