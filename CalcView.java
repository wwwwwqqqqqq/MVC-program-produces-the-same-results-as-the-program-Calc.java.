package Calculator;

/**
 * @author Weiwei Qin
 * Implementation of computing function.
 */

import java.awt.*;
import java.math.BigInteger;

import javax.swing.*;

import Calculator.CalcModel;

public class CalcView extends JPanel {
	private JTextField m_totalTf     = new JTextField(10);
	private JTextField m_userInputTf = new JTextField(10);
	private JButton    m_multiplyBtn = new JButton("Multiply");
	private JButton    m_clearBtn    = new JButton("Clear");
	private CalcModel calcModel;
	
	public CalcView() {
		m_totalTf.setText(calcModel.getInitialValue());
		m_totalTf.setEditable(false);
		
		setLayout(new FlowLayout());
		add(new JLabel("Input"));
		add(m_userInputTf);
		add(m_multiplyBtn);
		add(new JLabel("Total"));
		add(m_totalTf);
		add(m_clearBtn);
	}
	
	//Get the value of total calculation.
	public JTextField getM_totalTf() {
		return m_totalTf;
	}

	//Get the value of input.
	public JTextField getM_userInputTf() {
		return m_userInputTf;
	}

	//Get the value of multiply bottom, multiply total and input.
	public JButton getM_multiplyBtn() {
		return m_multiplyBtn;
	}

	//Get the value of clear bottom, clear the value.
	public JButton getM_clearBtn() {
		return m_clearBtn;
	}
}
