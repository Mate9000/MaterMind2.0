package data;

import java.util.ArrayList;

public class Arraylistex02 {

	public static void main(String[] args) {
		ArrayList<Integer> 
		i = new ArrayList<Integer>();

		i.add(0);
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(543g);
		for (int x = i.size() - 1; x >= 0; x--) {
			if (i.get(x)%2 == 0)
				i.remove(x);
		}
		System.out.println(i);
	}

}
