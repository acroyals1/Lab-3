
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
public class NumberSumssssCh4 {

	public static void main(String[] args) {

                int number;
		
		String input1 = JOptionPane.showInputDialog("Would you please enter a positive nonzero integer");
		
		number = Integer.parseInt(input1);
		
		int sum = 0;
		
		while(number >= 1){
			sum += number;
			number--;
		}
		JOptionPane.showMessageDialog(null, "Sum: " + sum);
		
	}
}

