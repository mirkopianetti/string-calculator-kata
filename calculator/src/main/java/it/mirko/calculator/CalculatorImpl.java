package it.mirko.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorImpl implements ICalculator {

	private final String REGEX_NUMBER = "-?\\d+";
	
	private final Integer MAX_NUMBER = 1000;


	/**
	 * @author Mirko Pianetti
	 * @param numbers
	 * @return Integer
	 * @throws Exception
	 * 
	 * 
	 */

	public Integer add(String inputData) throws Exception {
		try {
			Pattern pattern = Pattern.compile(REGEX_NUMBER);
			Matcher matcher = pattern.matcher(inputData);
			Integer sommaNumerica = 0;
			while (matcher.find()) {
				Integer numeroParse = Integer.parseInt(matcher.group());
				Integer numeroImpl = numeroParse > MAX_NUMBER ? 0 : numeroParse;
				if (numeroImpl < 0) {
					throw new NumberFormatException("negatives not allowed: " + numeroImpl);
				}
			
				sommaNumerica += numeroImpl;
			}
			return sommaNumerica;
		} catch (Exception e) {
			throw e;

		}

	}


}
