package Com.xworkz.java.Oops.polymorphsim.MethodOverriding;

public class MethodoverlaodingDemo {

	public static void main(String args[]) {
		RBI rbi=new RBI();
		BankofBorada bankofBorada=new BankofBorada();
		Vikas vikas=new Vikas();
		bankofBorada.RateofInterset();
		vikas.RateofInterset();
		rbi.RateofInterset();
	}
}
