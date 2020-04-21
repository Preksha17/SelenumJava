package colllections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class Hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				HashMap<Integer, String> hm= new HashMap<Integer,String>();
				hm.put(1, "Apple");
				hm.put(2, "Pinapple");
				hm.put(3, "Banana");
				hm.put(null,"3");
				System.out.println(hm);
				for(Map.Entry hmm : hm.entrySet() )//for mapping and printing each value in hashmap
				{
					//System.out.println(hmm);
					System.out.println(hmm.getKey()+ "  "+ hmm.getValue());
				}
				
				LinkedList<String> list = new LinkedList<String>();
				list.add("Helloooo");
				list.add("Ant");
				list.add("Bat");
				list.add("Cat");
				
				
				System.out.println(list);
				//for mapping and printing each value in linked list	
				
				//Traversing list through Iterator  
				Iterator<String> itr = list.iterator();
				   while(itr.hasNext())
				   {
				    System.out.println(itr.next());
				   }
				list.addFirst("first apple");
				list.addLast("Zebra last");
				
				
				Iterator<String> itr3 = list.iterator();
				   while(itr3.hasNext())
				   {
				    System.out.println(itr3.next());
				   }
				   ArrayList<String> A_list= new ArrayList<String>();
				   
				   A_list.add("Butter");
				   A_list.add("Butter1");
				   ArrayList<String> A_list2= new ArrayList<String>();
				   A_list2.add("Butter2");
				   A_list2.addAll(A_list);//Adding list1 to list 2
				   System.out.println(A_list);
				   System.out.println(A_list2);

		}
	

}
