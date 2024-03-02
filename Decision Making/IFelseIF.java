
public class IFelseIF {

	public static void test(int num) {
		if(num > 10) {
		System.out.println(num+" is greater than 10");
		}
		else if(num == 10) {
			System.out.println(num+" is equal to 10");
			
		}
		if(num < 10) {
			System.out.println(num+" is lesser than 10");
		}
	
	}
	public static void main(String[] args) {
		test(10);
		test(5);
		test(30);
	}
}
