package Calculator;

/**
 * @author Weiwei Qin
 * Control the main function of the calculator. 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;

import Calculator.CalcModel;
import Calculator.CalcView;

public class CalcController {
	private CalcModel calcModel;
	private CalcView calcView;
	
	public CalcController() {
		calcModel = new CalcModel();
		calcView = new CalcView();
		
		//... Listener to do multiplication
		 calcView.getM_multiplyBtn().addActionListener(new ActionListener() 
		 {
		   public void actionPerformed(ActionEvent e) 
		   {
		    try 
		    {
		      calcModel.setTotalValue(calcModel.getTotalValue().multiply(new BigInteger(calcView.getM_userInputTf().getText())));
		      calcView.getM_totalTf().setText(calcModel.getTotalValue().toString());
		    } 
		    catch (NumberFormatException nex) 
		    {
		      JOptionPane.showInputDialog(nex,"Bad Number");
		    }
		   }
		 });
		        
		 //... Listener to clear.
		 calcView.getM_clearBtn().addActionListener(new ActionListener() 
		 {
		  public void actionPerformed(ActionEvent e) 
		  {
		    calcModel.setTotalValue(new BigInteger(calcModel.getInitialValue()));
		    calcView.getM_totalTf().setText(calcModel.getInitialValue());
		  }
		  });
	}
	
	public JPanel getCalcView() {
		return calcView;
	}
	
	//Execute the calculator.
	public static void main(String[] args) {
		CalcController calcController = new CalcController();
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setTitle("My MVC");
		window.setVisible(true);
		
		//get content from CalcView(), change from this.setContentPane(content);
		window.getContentPane().add(calcController.getCalcView());
		
		//change from this.pack();
		window.pack();
	}

}
