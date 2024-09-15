package app;

import java.util.Scanner;

public class TinhToanHCN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.print("Nhap chieu dai:");
		double chieuDai = scanner.nextDouble();
		System.out.print("Nhap chieu rong:");
		double chieuRong = scanner.nextDouble();	
		
		System.out.println("Chu vi hinh chu nhat la:"+(chieuDai+chieuRong)*2);
		System.out.println("Dien tich hinh chu nhat la:"+(chieuDai*chieuRong));
		System.out.println("Canh nho nhat la:"+ Math.min(chieuDai, chieuRong));
	}

}
