package app;

import java.util.Scanner;

public class HelloWorld {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//			System.out.println("Hello World");
//	}
	
	//Đối tượng Scanner
//	** Cung cấp thư viện **
//	 import java.util.Scanner;
//     Scanner scanner = new Scanner(System.in);
	
//	== Các phương thức cấp sẵn==
//	scanner.nextLine() ==> Nhận 1 dòng từ bàn phím ==> trả ra dữ liệu string
//	scanner.nextInt() ==> Nhận 1 số nguyên từ bàn phím ==> trả ra dữ liệu số nguyên
//	scanner.nextDouble() ==> Nhận 1 số thực từ bàn phím ==> trả ra dữ liệu số thực

//	Ví dụ:
//	Khai báo 2 biến name và age.
//	Nhập name và age từ bàn phím
//	Sử dụng 3 hàm trên để in ra màn hình:
//		My name is <name>, age= <age>
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ten cua ban:");
		String name = scanner.nextLine();
		System.out.println("Nhap so diem cua ban");
		double score =  scanner.nextDouble();
		
		System.out.println("<Ten sinh vien:>"+name +"\n"+"<So diem:>"+ score);
		scanner.close();
	}
}
