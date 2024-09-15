package app;

import java.util.Scanner;

public class TheTichLapPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao do dai canh:");
		double doDai = scanner.nextDouble();
		double theTich = Math.pow(doDai,3);
		System.out.println("The tich lap phuong la:"+theTich);
		scanner.close();
	}

}
