package exam02_workshop;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("세 정수의 최대값 구하기");
		System.out.println("a 값:");
		int a = scan.nextInt();
		System.out.println("b 값:");
		int b = scan.nextInt();
		System.out.println("c 값:");
		int c = scan.nextInt();
		
		if(a>b&& a>c) {
			System.out.println("최대값 "+a);
		}
		if(b>a&& b>c ) {
			System.out.println("최대값 "+b);
		}
		if(c>b&& c>a ) {
			System.out.println("최대값 "+c);
		}
	}
}
