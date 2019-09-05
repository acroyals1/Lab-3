
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
public class COOKIES {
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
 
    System.out.print("Enter how many cookies the cookie monster scarfed down: ");
 
    int cookieCounts = sc.nextInt();
 
    int servingSizeofcookies = 40/10;
    int caloriesPerCookie = 300/servingSizeofcookies;
    int totalCalories = cookieCounts * caloriesPerCookie;
 
    System.out.println("Total calories the cookie monster consumed: " + totalCalories);
  }
}
