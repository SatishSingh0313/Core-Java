
public class MainSwitch {
	
  public static void test(char option) {
	switch(option) {
	
	case 'a': System.out.println("a is selected");
			break;
	case 'b':System.out.println("b is selected");
			break;
	case 'c':System.out.println("c is selcted");
			break;
	case 'd':System.out.println("d is selcted");
			break;
	default:System.out.println("no option is selcted");
	
	}
}
	public static void main(String [] args) {
		test('a');
		test('b');
		test('c');
		test('d');
		test('e');
	}
}
