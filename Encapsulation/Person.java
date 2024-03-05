 
class Age {
	private int age;
	
	public void setAge(int age) {
		this.age=age;
	}
	   public int getAge() {
		return age;
	}
}
public class Person {
	public static void main(String[] args) {
		Age a = new Age();
		a.setAge(24);
		
		int age=a.getAge();
		System.out.println("Age :"+age);
		
	}

}
