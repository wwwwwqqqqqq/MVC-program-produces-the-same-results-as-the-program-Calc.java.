package Calculator;

/**
 * @author Weiwei Qin
 * Read and store value of the calculator.
 */

import java.math.BigInteger;

public class CalcModel {
	private static final String INITIAL_VALUE = "1";
	private BigInteger m_total;  // The total current value state.
	
	public CalcModel() {
		m_total = new BigInteger(INITIAL_VALUE);
	}
	
	//Get the initial value, we set it as 1.
	public static String getInitialValue() {
		return INITIAL_VALUE;
	}
	
	//Set the total value
	public void setTotalValue(BigInteger total) {
		m_total = total;
	}
	
	//Get the total value.
	public BigInteger getTotalValue() {
		return m_total;
	}
}
