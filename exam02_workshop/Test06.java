package exam02_workshop;

public class Test06 {
	public static void main(String[] args) {
		for(int i= 1; i<=6; i++) {
			for(int n= 1; n<=6; n++) {
				for(int t= 1; t<=6; t++) {
					if(i*n*t%3==0) {
						System.out.println(i+"*"+n+"*"+t+"="+(i*n*t));
					}
					
				}
			}
		}
	}

}
