package string;

public class Display {
public static void main(String[] args) {
	 
	    String s1 ="Devloper";
	    char[] c1 = s1.toCharArray();
	    for(int i=0;i<s1.length();i++) {
	    	System.out.println(c1[i]);    	
}
	    System.out.println("=========================");
    	
    	String s2 = "Devloper";
    	char[] c2 = s2.toCharArray();
    	for(int j=s2.length()-1;j>=0;j--) {
    		System.out.println(c2[j]);
    	}
    	
   
}
}