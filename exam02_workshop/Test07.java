package exam02_workshop;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("한 자리 정수를 입력하시오");
		int input = scan.nextInt();
		System.out.println(input);
		
		int sum =0;
		for(int i =0; i<=100;i++) {
			if(i%input == 0) {
				sum+=i;
				System.out.print(i);
			if(i+input<=100){
			System.out.print("+");
			}
			}
			
			
		}
		System.out.print(" = "+sum);
	}

}
