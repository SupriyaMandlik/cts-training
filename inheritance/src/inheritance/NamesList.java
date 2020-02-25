package inheritance;
import java.util.ArrayList;
public class NamesList {
	
	static ArrayList<String> names=null;
	
	static {
		names = new ArrayList<>();
			names.add("ram");
			names.add("sam");
	}
	
	public boolean addName(String name) {
		return true;
		
	}
	public boolean deleteName(String name) {
		return true;
	}
	
	public boolean updateName(String name) {
		return true;
	}
	
	public boolean getName(String name) {
		return null;
	}
	
	public List<String> getAllNames();
		return names;
	}
}
