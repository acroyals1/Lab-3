
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class BankCharges {
    public static void main(String[] args) {
        
		double baseFee = 10;
		
		String input1 = JOptionPane.showInputDialog("Enter the number of checks that have been written");
		
		int checkswritten = Integer.parseInt(input1);
		
		double lessTwenty = .10*checkswritten;
		double twentyPlus = .08*checkswritten;
		double fortyPlus = .06*checkswritten;
		double sixtyPlus = .04*checkswritten;
		
		double lessTwentyTotal = .10*checkswritten + baseFee;
		double twentyPlusTotal = .08*checkswritten + baseFee;
		double fortyPlusTotal = .06*checkswritten + baseFee;
		double sixtyPlusTotal = .04*checkswritten + baseFee;
		
	    NumberFormat df = DecimalFormat.getInstance();
	    df.setMaximumFractionDigits(2);
		 	
		if (checkswritten < 60)
			if (checkswritten >= 40)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checkswritten + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(fortyPlus) + "\nTotal Fees: $" + fortyPlusTotal);
			else if(checkswritten >= 20)
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checkswritten + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(twentyPlus) + "\nTotal Fees: $" + twentyPlusTotal);
			else
				JOptionPane.showMessageDialog(null, "Check (QTY): " + checkswritten + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(lessTwenty) + "\nTotal Fees: $" + lessTwentyTotal);
		else
			JOptionPane.showMessageDialog(null, "Check (QTY): " + checkswritten + "\nBase Fee: $" + baseFee + "\nCheck Fees: $" + df.format(sixtyPlus) + "\nTotal Fees: $ " + sixtyPlusTotal);
	}
}
