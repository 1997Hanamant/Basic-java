package Com.xworkz.java.Oops.polymorphsim.methodoverridingassingnment;

public class MethodoverringDemo {
	public static void main(String args[]) {
		Vechile vechile=new Vechile();
		Bike bike=new Bike();
		Car car=new Car();
	    vechile.companyname="Honda";
	    vechile.location="Hubli";
	    bike.name="Hero Honda";
	    car.name="Honda Accord";
	    bike.Run();
	    car.Run();
	    System.out.println("Vechile Companyname:"+vechile.companyname);
	    System.out.println("Vechile location:"+vechile.location);
		System.out.println("Bike name:"+bike.name);
		System.out.println("Car name:"+car.name);
	}
	}