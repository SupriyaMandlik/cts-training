package inheritance;

//import java.util.HashMap;
//import java.util.Hashtable;
//import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;
public class MapDemo {
public static void main(String...args)
{
	//HashMap<String,Integer>map=new HashMap<>();
	//LinkedHashMap<String,Integer>map=new LinkedHashMap<>();
	TreeMap<String,String>map=new TreeMap<>();
	//Hashtable<String,Integer>map=new Hashtable<>();
	map.put("Banana", "35");
	map.put("Orange", "60");
	map.put("Mango", "110");
	map.put("Grapes", "200");
	map.put("Water melon","20");
	//map.put("banana",70);
	//map.remove("banana");
	//map.replace("Grapes",100);

	
	
	for (Entry<String,String>entry:map.entrySet())
	{
		System.out.println(entry.getKey()+ " --->  " +entry.getValue());
	}
	
	
}
}
