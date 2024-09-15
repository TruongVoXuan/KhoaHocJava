package app;

import java.util.Scanner;

public class ChoosePhepToan {

	public static void main(String[] args) {
		System.out.print("Nhập lựa chọn phép tính:");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		
		switch(value) {
		case "+":
			System.out.println("Bạn đã lựa chọn phép cộng");
		
			break;
		case "-":
			System.out.println("Bạn đã lựa chọn phép trừ");
			
			break;
		default:
			System.out.println("Không hợp lệ!");
				System.exit(0);
			
		}
		System.out.println("Nhap vao a:");
		int a= scanner.nextInt();
		System.out.println("Nhap vao b:");
		int b= scanner.nextInt();
		
		switch(value) {
		case "+":
			System.out.println("Result:"+(a+b));
			break;
		case "-":
			System.out.println("Result:"+(a-b));
			break;
		}
	
		scanner.close();
	}

}
