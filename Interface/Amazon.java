
interface Prime{
	int Userid=101;
	long pwd=87878;
	void PrimeVideo();
}

interface NonPrime extends Prime{
	void NonPrimeVideo();
}

public class Amazon implements NonPrime  {
	@Override
	public void PrimeVideo() {
		System.out.println("Watch Prime Video");
		
	}
	@Override
	public void NonPrimeVideo() {
		System.out.println("Watch Non Prime Video");
		
	}
	public static void main(String[] args) {
		
		Amazon a1 = new Amazon();
		System.out.println("User ID is : "+Prime.Userid);
		System.out.println("User PassWord is : "+Prime.pwd);
		a1.PrimeVideo();
		System.out.println("==================");
		a1.NonPrimeVideo();
		
		
	}
	
		
	}


