
public class Nested {
public static void test(int num) {
	if(num >50) {
	System.out.println(num+" is greater than 50");
	if(num <= 50) {
		System.out.println(num+" lesser than 50");
	}
 }
}
public static void main(String [] args) {
	
	test(40);
	test(70);
	test(80);
}
}