public class USMoney{
	private int dollars;
	private int cents;
	
	public USMoney(int dol, int cent){
		int aux;

        if (dol < 0 || cent < 0) {

            dollars = 0;
            cents = 0;

        }else{

            dollars = dol;

            if (cent >= 0 && cent < 100) {
                cents = cent;

            } else {
                aux = cent / 100;
                dollars += aux;
                cents = cent - (aux * 100);
            }
        }
	}
	
	public USMoney plus(USMoney info){

        USMoney novo = new USMoney((dollars + info.getDollars()), (cents + info.getCents()));

        return novo;
    }
	
	public int getDollars(){
		return dollars;
	}
	
	public int getCents(){
		return cents;
	}
	
}