
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
public class TAXESSUCK {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Your amount purchased was:");
        
        float priceAmount = in.nextFloat();
        
        float countyTAX = .02F;
        float stateTAX = .04F;
        
        float countyTAXPrice = (priceAmount * countyTAX);
        float stateTAXPrice = (priceAmount *stateTAX);
        float totalTAX = (countyTAXPrice + stateTAXPrice);
        float totalSale =(totalTAX + priceAmount);
        
        System.out.println("County Tax Amount:$" + countyTAXPrice + "\n" + "State Tax Amount:$" + stateTAXPrice + "\n" + "Total Tax Amount:$" + totalTAX + "\n" + "Total Sale Amount:$" + totalSale);
        
// I could not figur out how to round to the nearest two decimal places.
    }
}
