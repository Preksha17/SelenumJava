package colllections;

import java.util.HashSet;

public class HashSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("aaa");
		hs.add("bbb");
		//System.out.println(hs);
		//hs.remove("bbb");
		
		System.out.println(hs);
		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("aaarr");
		hs2.add("bbb");
		System.out.println(hs2);
		hs.addAll(hs2);
		System.out.println(hs);
	
	}

}
