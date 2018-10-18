public class MinhaData {
	private int dia;
	private int mes;
	private int ano;
	
	public MinhaData(int oDia, int oMes, int oAno){
		if(oDia > oAno){
			int temp;
			
			temp = oDia;
			oDia = oAno;
			oAno = temp;
		}
		
		if(ehValida(oDia, oMes, oAno) == true){
			dia = oDia;
			mes = oMes;
			ano = oAno;
		}else{
			dia = 01;
			mes = 01;
			ano = 1990;
		}
	}
	
	private boolean ehValida(int oDia, int oMes, int oAno){
		boolean result = false;
		
		if(oDia >= 1 && oDia <= 31){
			result = true;
		}
		
		if(result && (oMes < 1 || oMes > 12)){
			result = false;
		}
		
		if(result && oAno < 0){
			result = false;
		}
		
		return result;
	}
	
	public String dataBrazil(){
		String txt;
		txt = dia + "/" + mes + "/" + ano;
		return txt;
	}
	
	public String dataEUA(){
		String txt;
		txt = ano + "-" + mes + "-" + dia;
		return txt;
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
}