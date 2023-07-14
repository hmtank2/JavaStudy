package workshop03;

public class Test9 {
	public static void main(String[] args) {
			int[] arr3 = new int[5];
			

			//출력
			int sum = 0;
			for(int i=arr3.length-1; i>=0 ;i--) {
				int num = (int)(Math.random()*10);
				arr3[i]=num;
				System.out.print(arr3[i]+" ");
				sum+=arr3[i];
			}
			
			
			System.out.println("");
			System.out.println("sum : "+sum);
			System.out.println("avg : "+(sum/arr3.length));
			
			
		}
		
	
}
