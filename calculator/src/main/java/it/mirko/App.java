package it.mirko;

import it.mirko.calculator.CalculatorImpl;
import it.mirko.calculator.ICalculator;

/**
 * 
 * @author mirko
 *
 *La classe con il metodo main ha il solo scopo di effettuare tutte le prove
 *di funzionalità del codice prodotto
 * 
 *
 */
public class App { 	
	public static void main(String[] args) {
			
		try {
			if (args.length==0){
				throw new NullPointerException("L'applicazione deve essere lanciata con un parametro di tipo String");
				//I successivi parametro non li gestisco
			}
		
			for (String valoreInput: args) {
				try {
					ICalculator calculator = new CalculatorImpl();
					
					//Il sistema ritorna direttamente il risultato
					System.out.println(calculator.add(valoreInput));
		            
				} catch (Exception e) {
					  System.err.println(e.getMessage());
				}
				
	        }
			
		System.exit(1);
			

		} catch (NullPointerException ex) {
			  System.err.println(ex.getMessage());
		     
		}
	}

}
