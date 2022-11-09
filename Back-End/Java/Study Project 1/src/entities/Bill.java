package entities;

public class Bill {

	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;

	public double couvert() {
		if (feeding() > 30) {
			return 0.0;
		} else
			return 4.0;
	}

	public double feeding() {
		return beer * 5 + softDrink * 3 + barbecue * 7;
	}

	/* Tive uma ajuda no grupo do discord para realizar essa solucao, minha primeira solucao foi:
	   if (gender == 'F' || gender == 'f'){
	   	   return 8.0;
	   	} else 
	   	   return 10.0;
	*/
	public double ticket() {
		return gender == 'F' ? 8.0 : 10.0;
	}

	public double total() {
		return feeding() + ticket() + couvert();
	}
/*
	public String toString() {
		return "Relatorio: " 
				+"\n"
	            + "Consumo: R$" 
				+ feeding() 
				+ "\n"				 
				+ couvert() 
				+ "\n" 
				+ "Ingresso: R$"
				+ ticket() 
				+ "\n" 
				+ "Total a pagar: R$" 
				+ total();
*/
}


