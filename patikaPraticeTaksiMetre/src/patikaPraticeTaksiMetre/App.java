package patikaPraticeTaksiMetre;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		double startPrice = 10.0;
		
		double perKm = 2.20;
		
		double minPrice = 20.0;
		
		System.out.println("Please enter distance(km): ");
		Scanner sc = new Scanner(System.in);
		
		double kmInput = sc.nextDouble();
		
		double totalPrice = kmInput * perKm;
		
		totalPrice += startPrice;
		
		if(totalPrice <= 20) {
			System.out.println("total price : " + 20);
		}
		
		else {
			System.out.println("total price : " + totalPrice);
		}
	}

}
