package exam02_workshop;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n 까지의 총합 구하기");
		int a= 0;
		int b= 0;
		System.out.println("a값:");
		a = scan.nextInt();
		while(true) {
			
			System.out.println("b값:");
			b = scan.nextInt();
			if(b<a) {
				System.out.println("a보다 큰 값을 입력하세요!");
				continue;
			}else {
				break;
			}
			
		}
		System.out.println("b - a 는"+(b-a)+"입니다.");
	}
}
