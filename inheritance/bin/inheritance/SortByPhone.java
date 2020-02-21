package inheritance;

import java.util.Comparator;

public class SortByPhone implements Comparator<Employee>{
	@Override
	public int compare(Employee emp1,Employee emp2)
	{
		if(emp1.getPhone()>emp2.getPhone())
		{
			return 1;
		}else if(emp1.getPhone()==emp2.getPhone()) {
			return 0;
		}else {
			return -1;
		}
	}
	

}



