package string;

public class String_Method {
 public static void main(String[] args) {
	
	 String s = "Web Technology";
	 String s1 = "web technology";
	 
	 System.out.println(s);
	 System.out.println(s.toUpperCase());
	 System.out.println(s.toLowerCase());
	 System.out.println(s.startsWith("Web"));
	 System.out.println(s.startsWith("web"));
	 System.out.println(s.endsWith("logy"));
	 System.out.println(s.concat(" Devloper"));
	 System.out.println(s.charAt(4));
	 System.out.println(s.indexOf('T'));
	 System.out.println(s.length());
	 System.out.println("----------------------");
	 System.out.println(s+s1);
	 System.out.println(s.equals(s1));
	 System.out.println(s.equalsIgnoreCase(s1));
	
}
}