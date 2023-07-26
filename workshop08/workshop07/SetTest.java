package workshop07;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hashset = new HashSet();
		String[] str = args;
		
		for (Object args1 : args) {
			hashset.add(args1);
			System.out.println(hashset);
			
		}
		
		for(int i = 0; i<args.length;i++)
		{
			hashset.add(args[i]);
			System.out.println(args[i]);
		}
		System.out.println(hashset);
	}

}
