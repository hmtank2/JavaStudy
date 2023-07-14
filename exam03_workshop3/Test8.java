package workshop03;

public class Test8 {
	public static void main(String[] args) {
		 int [] score= {99,34,67,22,11,9};


//		 System.out.println("사람 수 "+ input);
//			for(int i =0;i<=score.length-1;i++) {
//				int num = (int)(Math.random()*100)+100;
//				System.out.println("사람"+i+":"+num);
//				score[i]=num;
//			}
			
			int max_value = score[0];
			int min_value = score[0];
			for(int i =1;i<=score.length-1;i++) {
				if(score[i]>max_value) {
					max_value = score[i];
				}
				if(score[i]<min_value) {
					min_value = score[i];
				}
			}
			System.out.println("최댓값: "+max_value);
			System.out.println("최댓값: "+min_value);
			
		}
		
	
}
