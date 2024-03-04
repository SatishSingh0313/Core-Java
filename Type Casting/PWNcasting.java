
public class PWNcasting {  //Widening & Narrowing Casting
	public static void main(String[] args) {
			System.out.println("==========Widening==========");
		
		int a =10;
		double b =a;
		System.out.println(a);
		System.out.println(b);
		
		char x ='A';
		int y=x;
		System.out.println(x);
		System.out.println(y);
		
		byte j1=20;
		float k1=j1;
		System.out.println(j1);
		System.out.println(k1);
		
		short s1=50;
		int s2=s1;
		System.out.println(s1);
		System.out.println(s2);
		
		float f2=20.20F;
		double d2=f2;
		System.out.println(f2);
		System.out.println(d2);
		
		char a2='B';
		int a3=a2;
		System.out.println(a2);
		System.out.println(a3);
		
		
			System.out.println("============Narrowing============");
		
		int i =20;
		char j=(char)i;
		System.out.println(i);
		System.out.println(j);
		
		double c= 5.5;
		int d=(int)c;
		System.out.println(c);
		System.out.println(d);
		
		long l=87887878L;
		double m= l;
		System.out.println(l);
		System.out.println(m);
		
		long s=100005145648648L;
		byte k =(byte)s;
		System.out.println(s);
		System.out.println(k);
		
		char a4='C';
		byte a5=(byte)a4;
		System.out.println(a4);
		System.out.println(a5);
		
		double d4=50.50;
		float d5=(float)d4;
		System.out.println(d4);
		System.out.println(d5);
		
		float f4=10.50F;
		long f5=(long)f4;
		System.out.println(f4);
		System.out.println(f5);
		
		long l4=5452112221L;
		int l5=(int)l4;
		System.out.println(l4);
		System.out.println(l5);
		
		int i4=40;
		short i5=(short)i4;
		System.out.println(i4);
		System.out.println(i5);
		
		short s4=30;
		byte s5=(byte)s4;
		
		System.out.println(s4);
		System.out.println(s5);

	}

}
