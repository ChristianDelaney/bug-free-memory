package day11_review;

import java.util.Scanner;

public class Task4CoffeeMachine {

	public static void main(String[] args) {

		Scanner coffee = new Scanner(System.in);

		System.out.println("Please enter how many cups of coffe you'll need: ");

		int cupsOfCoffee = coffee.nextInt();
		int amountOfWater = cupsOfCoffee * 1;
		int amountOfMilk = cupsOfCoffee / 5;
		int amountOfCoffeeBeans = cupsOfCoffee * 5;

		System.out.println("For " + cupsOfCoffee + " cups of coffee you will need " + amountOfWater + " ml of water");
		System.out.println("For " + cupsOfCoffee + " cups of coffee you will need " + amountOfMilk + " ml of milk");
		System.out.println("For " + cupsOfCoffee + " cups of coffee you will need " + amountOfCoffeeBeans + " g of coffee beans");

	}

}
