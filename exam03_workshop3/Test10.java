package workshop03;
import java.util.Arrays;

public class Test10 {
	public static void main(String[] args) {
			int[][] arr3;
			int temp = 0;
			while(temp==0) {
				System.out.println(Arrays.toString(args));
				if(args.length!=2) {
					System.out.println("다시 입력 하세요");
					break;
				}
	
				String strNum1 = args[0];
				String strNum2 = args[1];
				int num1 = Integer.parseInt(strNum1);
				int num2 = Integer.parseInt(strNum2);
				
				if((num1>5|| num1<1)||(num2>5|| num2<1) ) {
					System.out.println("숫자를 확인 하세요");
					break;
				}
				
				arr3 = new int[num1][num2];
				
				//random 대입,출력, sum
				int sum = 0;
				int cnt =0;
				for(int i=0; i<=arr3.length-1 ;i++) {
					for(int j=0; j<=arr3[i].length-1 ;j++) {
						int num = (int)(Math.random()*5)+1;
						arr3[i][j]=num;
						System.out.print(arr3[i][j]+" ");
						sum+=arr3[i][j];
						cnt++;
					}
				}
				
				
				System.out.println("");
				System.out.println("sum : "+sum);
				System.out.println("avg : "+(sum/cnt));
				temp++;
			}
			
			
		}
		
	
}
