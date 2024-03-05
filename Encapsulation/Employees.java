
class EmpNameAge{
	private int id;
	private String name;
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class Employees {
public static void main(String[] args) {
	EmpNameAge e1=new EmpNameAge();
	System.out.println(e1.getName()+" "+e1.getId());
	
	System.out.println("---------------");
	
	e1.setName("Satish");
	e1.setId(101);
	System.out.println("Name: "+e1.getName());
	System.out.println("Id: "+e1.getId());
}
}
