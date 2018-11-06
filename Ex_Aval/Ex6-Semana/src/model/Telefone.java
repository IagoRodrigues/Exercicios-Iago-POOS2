package model;

public class Telefone implements ICoisa{
	private int ddd;
	private int prefixo;
	private int sufixo;
	
	//Construtor para telefone
	public Telefone(int ddd, int prefixo, int sufixo) {
		super();
		this.ddd = ddd;
		this.prefixo = prefixo;
		this.sufixo = sufixo;
	}
	
	public int getDdd() {
		return ddd;
	}
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	public int getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}
	public int getSufixo() {
		return sufixo;
	}
	public void setSufixo(int sufixo) {
		this.sufixo = sufixo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		sb.append(getDdd());
		sb.append(") ");
		sb.append(getPrefixo());
		sb.append("-");
		sb.append(getSufixo());
		return sb.toString();
	}
}
