
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author acroy
 */
public class BarrrrrsAndChartsCh4HW {
    	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
		int sales = 0;
		
		System.out.print("Enter today's sales for store I: ");
		int salesI = input.nextInt();
		
		System.out.print("Enter today's sales for store II: ");
		int salesII = input.nextInt();
		
		System.out.print("Enter today's sales for store III: ");
		int salesIII = input.nextInt();
		
		System.out.print("Enter today's sales for store IV: ");
		int salesIV = input.nextInt();
		
		System.out.print("Enter today's sales for store V: ");
		int salesV = input.nextInt();
		
		System.out.println("");
		
		System.out.println("Bar Chart For Sales");
		for(int k = 1; k <= 5; k++){
			System.out.print("Store " + k + ": ");
			switch(k){
			case 1:
				sales = salesI;
				break;
			case 2:
				sales = salesII;
				break;
			case 3:
				sales = salesIII;
				break;
			case 4: 
				sales = salesIV;
				break;
			case 5:
				sales = salesV;
			}
			for(int l=1; l<=sales/100; l++){
				System.out.print("=");
				
			}
			System.out.println("");
		}
        }
}
