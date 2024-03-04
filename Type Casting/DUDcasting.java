
abstract class Test_Yantra{   //UpCasting & DownCasting
	abstract  public void Test();
	void Project() {
		System.out.println("Project in Under Developing Departpent");
	}
}

 interface Qspider{
	  void Devlop();
 }
 
class Jspider extends Test_Yantra implements Qspider{
	@Override
	public void Test() {
		System.out.println("Testing Project");
		
	}

	@Override
	public void Devlop() {
		System.out.println("Developing Project");
		
	}
	
	public void Display() {
		System.out.println("Display Project");
		
	}	
}

public class DUDcasting {
	public static void main(String[] args) {
		
	System.out.println("========UpCasting==========");
	
		Test_Yantra t1=new Jspider();
		t1.Test();
		t1.Project();
		
		System.out.println("=========DownCasting=======");
		
		Jspider j1 =(Jspider) t1;
		j1.Test();  
		j1.Project();
		j1.Display();
		j1.Devlop();
			
	}

}
