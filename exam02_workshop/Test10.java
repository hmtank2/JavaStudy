package exam02_workshop;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n 까지의 총합 구하기");
		int input = 0;
		while(true) {
			System.out.println("n 값:");
			input = scan.nextInt();
			if(input<=0) {
				continue;
			}else {
				break;
			}
			
		}
		//System.out.println("done");
		int sum = 0;
		for(int i =1; i<=input;i++) {
			sum+=i;
		}
		System.out.println("1부터 "+input+"까지의 총합 : "+sum);
	}
}
