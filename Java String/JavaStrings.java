
public class JavaStrings {
	public static void main(String[] args) {
		String s1="java";
		s1=s1.concat("Class");
		System.out.println(s1.length());
		System.out.println(s1);
		System.out.println("-----------------");
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		System.out.println("---------------------");
		StringBuilder sb1 = new StringBuilder("Software");
		sb1.append("Devloper");
		System.out.println(sb1);
		System.out.println(sb1.delete(8,16));
		
		System.out.println(sb1.append("hello"));
		
		
	}
     
}
 