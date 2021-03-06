//Scanner--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Scanner input;
input = new Scanner(System.in);

public String dataBrazil(){
	String txt;
	txt = dia + "/" + mes + "/" + ano;
	
	return txt;
}

//Nomenclaturas--------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Classe: Main, MinhaData
//Variável: teste, testeTeste
//Método: meuMetodo
//Pacote: model, view
//Projeto: MeuProjeto

//Array----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
int[] itens = new int[MAX]
//tipo_da_info[] nome_do_array = new tipo_do_array[qnt]
//ou
private Item[] itens;
itens = new Item[MAX];

//Array list:
private ArrayList<Nota> notas; //o tipo do array é nota, o nome é notas
notas = new ArrayList<>(qnt);

//vector
private Vector<Nota> notas; //o tipo é nota, o nome é notas
notas = new Vector<>(qnt);

//Linked List- lista duplamente encadeada
private LinkedList<Nota> notas;
notas = new LinkedList<>(); //não precisa definir o tamanho inicial


//Set, List e Queue precisam implementar equals() e compareTo() para funcionarem
//Set não possui Get, então precisa de Iterator
//O HashCode precisa ser eficiente para separar corretamente os objetos
//Exemplos:


@Override
public boolean equals(Object obj) {
	boolean iguais = false;
	
	if(obj != null && obj instanceof Usuario){
		iguais = this.username.equals(((Usuario) obj).getUsername());
	}
	
	return iguais;
}

@Override
public int compareTo(Usuario o) {
	int retorno = 0;
	
	if(o != null){
		retorno = this.username.compareTo(o.getUsername());
	}
	
	return retorno;
}

public Usuario recuperate(String username){
	Usuario usuario;
	Usuario retorno = null;
	
	Iterator<Usuario> iterator = usuarios.iterator();
	while (iterator.hasNext() && retorno == null){
		usuario = iterator.next();
		if(usuario.getUsername().equals(username)){
			retorno = usuario;
		}
	}
	return retorno;
}

@Override
public int hashCode() {
	return username.hashCode();
}

//Map------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Map<String, Usuario> mapaDeUsuario = new HashMap<>();

mapaDeUsuario.put("ednilson", new Usuario("ednilson", "Ednilson", "123"));

Usuario usuario = mapaDeUsuario.get("ednilson");

//Ternário-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
this.idade = idade >= 0 ? idade : 0 ;
//this.idade = idade. Se idade for menor ou igual a zero, idade recebe 0;

//ToString-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
@Override
public String toString() {
return "Contato: " + nome + " \t Telefone: " + telefone.toString();
}

public String toString(){
	StringBuffer sb = new StringBuffer();
	sb.append("ID: ");
	sb.append(id);
	sb.append("\t");
	sb.append("Descrição: ");
	sb.append(descricao);
	return sb.toString();
}

/*
Existem duas formas de polimorfismo:
– De métodos
	Falaremos mais adiante - classe filha tem os métodos da classe pai
– De compatibilidade de tipos
	Classes filhas são, também, do mesmo tipo da classe pai
*/

//Generics-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class MinhaClasse<E extends Comparable> {
	private E valor1; //crio duas variáveis do tipo E (genérico)
	private E valor2;

	public MinhaClasse(E valor1, E valor2) { //Passo para o construtor
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public boolean iguais(){ //comparo ambas
		return valor1.equals(valor2);
	}
}

public class Main {
	public static void main(String[] args) {
		// declara uma variavel que so aceitara inteiros
		MinhaClasse<Integer> mi = new MinhaClasse<Integer>(34, 12);

		if(mi.iguais())
		System.out.println("Sao iguais");

		// declara uma varivel que so aceitara strings
		MinhaClasse<String> ms = new MinhaClasse("Palavra1", "Palavra2");

		if(ms.iguais())
		System.out.println("Sao iguais");

		// declara uma variavel que aceitara qualquer tipo
		MinhaClasse mg = new MinhaClasse();

		if(mg.iguais())
		System.out.println("Sao iguais");
	}
}

//Arquivos-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Para escrever no arquivo:

public class Tabuada {
	public static void main(String[] args) throws IOException {
		int i, n;
		n = 6;
		
		FileWriter fileWriter = null; //criador de arquivos
		PrintWriter printWriter = null;  //impressora
		
		fileWriter = new FileWriter("/home/ednilsonrossi/Desktop/Saida.txt");
		printWriter = new PrintWriter(fileWriter);
		
		printWriter.printf("Tabuada do número %d\n", n);
		for(i = 0; i <= 10; i++) {
			printWriter.printf("%d x %d = %d \n", n, i, n*i);
		} 
		printWriter.close();
		fileWriter.close();
	}
}

//Para ler o arquivo:
/*
InputStreamReader
Realiza a ponte de comunicação de fluxos de
bytes para fluxos de caracteres: ele lê bytes e os
decodifica em caracteres.

BufferedReader
Lê o texto de um fluxo de entrada de caracteres,
armazenando-os em um buffer de caracteres para
fornecer a leitura eficiente de caracteres, matrizes e linhas.
*/

//Lendo byte e codificando para caractere:
public class LerTabuada2 {
	public static void main(String[] args) throws IOException{
		InputStream inputStream = null;
		InputStreamReader reader = null;
		int lido;
		
		inputStream = new FileInputStream("/home/ednilsonrossi/Desktop/Saida.txt");
		reader = new InputStreamReader(inputStream);
		
		while ((lido = reader.read()) != -1){
			System.out.print((char) lido);
		}
		
		reader.close();
		inputStream.close();
	}
}

//Linha toda:
public class LerTabuada3 {
	public static void main(String[] args) throws IOException{
		InputStream inputStream = null;
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		String linha;
		
		inputStream = new FileInputStream("/home/ednilsonrossi/Desktop/Saida.txt");
		inputStreamReader = new InputStreamReader(inputStream);
		bufferedReader = new BufferedReader(inputStreamReader);
		
		while((linha = bufferedReader.readLine()) != null){
			System.out.println(linha);
		}
		
		bufferedReader.close();
	}
}

//Try Catch------------------------------------------------------------------------------------------------------------------------------------------------------------------------
try {
	System.in.read(dados);
	nro = Integer.parseInt(new String(dados).trim());
} catch (IOException e) {
	System.out.println("Ocorreu um erro e o número não pode ser lido.");
	System.out.println("Mensagem: " + e.getMessage());
	nro = -1;
} catch (NumberFormatException nfe){
	System.out.println("Erro ao converter o número");
	nro = -1;
} catch (Exception e) {
	System.out.println("Não sei o que deu errado. Veja abaixo o erro:\n");
	e.printStackTrace();
	nro = -1;
}
finally{
	System.out.println("Nro lido: " + nro);
}