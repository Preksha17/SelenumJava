package colllections;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Ravi");
		set.add("Raj");
		set.add("Ajay");
		set.add("kkk");

		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		set.add("Ram");
		set.remove("kkk");
		System.out.println(set);
		

	}

}
