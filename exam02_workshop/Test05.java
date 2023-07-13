package exam02_workshop;
//import java.util.*;
public class Test05 {
	public static void main(String[] args) {
		//Random randrange = new java.util.Random();
		
		while(true){
			int num = (int)(Math.random()*10);
			if(num<=6 &&num>0) {
				System.out.println(num);
				break;
				}
		}
		
	}
}
