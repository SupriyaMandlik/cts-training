package inheritance;

public class Getters {
	 
	 private String name;
	 private int id;


	public String getName() {
	 return name;
	}

	public void setName(String name) {
	 this.name = name;
	}

	public int getId() {
	 return id;
	}

	public void setId(int id) {
	 this.id = id;
	}


	public static void main(String args[]){
	 
	 Getters obj = new Getters();
	 
	 obj.setName("java");
	 obj.setId(1);
	 System.out.println(obj.getName());
	 System.out.println(obj.getId());
	}


	}