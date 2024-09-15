package app;

import java.util.Scanner;

public class TimMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap oneNumber:");
		int oneNumber = scanner.nextInt();
		
		System.out.println("Nhap secondNumber:");
		int secondNumber = scanner.nextInt();
		
		System.out.println("MIN:"+Math.min(oneNumber, secondNumber)+"\n"+"MAX:" +Math.max(oneNumber, secondNumber));
		scanner.close();
	}

}
