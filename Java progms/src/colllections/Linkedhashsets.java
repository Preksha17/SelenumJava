package colllections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkd = new LinkedHashSet<>();
		linkd.add("car");
		linkd.add("bus");
		linkd.add("cycle");
		linkd.add("jjj");
		Iterator<String> itr = linkd.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		linkd.add("Hi");
		linkd.remove("bus");
		System.out.println(linkd);

	}

}
