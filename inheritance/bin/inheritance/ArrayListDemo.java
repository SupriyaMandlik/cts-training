package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class ArrayListDemo {
	public static void main(String[] args) {
		//HashSet<String> set=new HashSet<>();
		//LinkedHashSet<String> set=new LinkedHashSet<>();
		TreeSet<String> set=new TreeSet<>();
		set.add("Hello");
		set.add("To");
	    set.add("Java");
		set.add("Batch");
		set.add("Batch");
		set.add("Batch");
		set.add("7");
		set.add("true");
		
		//LinkedList<String> list=new LinkedList<>();
		//ArrayList<String> list =new ArrayList<>();
		/*list.add("Hello");
		list.add("To");
		list.add("Java");
		list.add("Batch");
		list.add("Batch");
		list.add("Batch");
		list.add("7");
		list.add("true");*/
		
		Iterator<String> it=set.iterator();
		while (it.hasNext())
{
	String element=it.next();
	 System.out.println(element);
}
		
		
		
		//list.addFirst("Start");
		//list.addLast("End");
		/*ListIterator<String> it=list.listIterator();
		System.out.println("***FORWARD DIRECTION***");
		while(it.hasNext())
		{
			 String element=it.next();
			 System.out.println(element);
			 if(element.contentEquals("Java"))
				 break;
		}
		System.out.println("***BACKWARD DIRECTION***");
		while(it.hasPrevious())
		{
			 String element=it.previous();
			 System.out.println(element);
		}
		
		 System.out.println("the object at index 2 is :"+list.get(2));
		
		/*System.out.println(list);
		list.remove(2);
		list.add(2,"Advanced java");
		System.out.println("list size" +list.size());
		System.out.println("list contains python?"+list.contains("python"));
		
		for(String obj : list)
		{
			if(obj.contentEquals("Java")) {
				break;
			}
			System.out.println(obj);
		}	*/
	}
}
