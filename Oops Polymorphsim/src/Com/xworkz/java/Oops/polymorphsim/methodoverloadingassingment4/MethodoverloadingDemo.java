package Com.xworkz.java.Oops.polymorphsim.methodoverloadingassingment4;

public class MethodoverloadingDemo {
	public static void main(String args[]) {
		AutomaticPromotion auto=new AutomaticPromotion();
		auto.M1(10);
		auto.M2(10.20f);
		auto.M1('a');
		auto.M2(10l);
		auto.M3('R');
		auto.M3('s');
		
	}

	
}
